package seckit.gui.runtime.controller;

import identity.IdentityRuntimeModel;
import identity.instance.DigitalIdentity;
import identity.instance.IdentityOwner;
import identity.instance.IdentityRealm;
import identity.instantiation.IdentityInstantiation;
import identity.type.IdentityType;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Map;

import org.apache.log4j.Logger;
import org.glassfish.grizzly.http.Cookie;
import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.server.Session;

import behavior.BehaviorDesignModel;
import behavior.BehaviorRuntimeModel;
import behavior.instance.Action;
import behavior.instance.Activity;
import behavior.instance.Behavior;
import behavior.instance.Interaction;
import behavior.type.ActionType;
import behavior.type.ActivityType;
import behavior.type.BehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.InteractionType;

import com.fasterxml.jackson.databind.ObjectMapper;

import data.DataRuntimeModel;
import data.instance.Data;
import data.instantiation.DataInstantiation;
import rule.RuleRuntimeModel;
import rule.action.Authorization;
import behavior.event.ActionEvent;
import behavior.event.ActivityEvent;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.runtime.RuntimeViewpointFactory;
import structure.instance.Entity;
import utils.ecore.ECoreUtils;

public class RuleHttpAdaptor extends HttpHandler {

    static Logger logger = Logger.getLogger(RuleHttpAdaptor.class);

    HttpServer server;

    LoginManager loginManager = new LoginManager();
    
    class LoginManager {

        public String getUser(Request request) {
            String user = "";
            Session session = request.getSession();
            if (session.getAttribute("user") != null) {
                user = session.getAttribute("user").toString();
            }
            return user;  
        }
        
        public boolean isAuthenticated(Request request) {
            Session session = request.getSession();
            if (session.getAttribute("user") != null) {
                return true;
            }
            return false;
        }
        
        public boolean authenticate(Request request, Response response, String user, String password) {
            String u = "admin";
            String p = "admin";            
            if (user.equals(u) && password.equals(p)) {
                Session session = request.getSession();
                //
                Cookie c = new Cookie("user", user);
                //setting cookie to expiry in 30 mins
                c.setMaxAge(30*60);                
                response.addCookie(c);
                //
                session.setAttribute("user", user);
                return true;
            }
            return false;
        }
        
        public void logout(Request request) {
            Session session = request.getSession();
            session.setAttribute("user", null);
        }
        
    }

    class LoginHandler extends HttpHandler {
        @Override
        public void service(Request request, Response response) throws Exception {
            response.setContentType("text/plain");
            Writer w = response.getWriter();
            // Get request parameters for userID and password
            String u = request.getParameter("username");
            String p = request.getParameter("password");
            //
            if (!loginManager.isAuthenticated(request)) {
                if (loginManager.authenticate(request, response, u, p)) {
                    w.write("{success: true}");
                } else {
                    w.write("{success: false, errors: {reason: 'Login failed. Try again.'}}");
                }
            }
            w.write("{success: true}");
        }
    }
    
    class LogoutHandler extends HttpHandler {
        @Override
        public void service(Request request, Response response) throws Exception {
            loginManager.logout(request);
            response.setContentType("text/plain");
            Writer w = response.getWriter();
            w.write("{success: true}");
        }
    }
    
    DesignViewpointFactory design;
    RuntimeViewpointFactory runtime;
    
    DataRuntimeModel dm;
    IdentityRuntimeModel i;
    BehaviorRuntimeModel b;
    RuleRuntimeModel r;
    
    public RuleHttpAdaptor(RuntimeViewpointFactory runtime) {
        this.design = runtime.design;
        this.runtime = runtime;
        
        server = HttpServer.createSimpleServer();
        // server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("htdocs"), "/");
        server.getServerConfiguration().addHttpHandler(this, "/pdp");
        /*
        server.getServerConfiguration().addHttpHandler(new LoginHandler(), "/login");        
        server.getServerConfiguration().addHttpHandler(new LogoutHandler(), "/logout");
        */        

        // TODO: move this models somewhere?
        if (runtime.viewpoint.getDataRuntimeModels().size() == 0)
            dm = runtime.data.createModel("Default");
        else
            dm = runtime.viewpoint.getDataRuntimeModels().get(0);

        if (runtime.viewpoint.getRuleRuntimeModels().size() == 0)
            r = runtime.rule.createModel("Default");
        else 
            r = runtime.viewpoint.getRuleRuntimeModels().get(0);

        if (runtime.viewpoint.getIdentityRuntimeModels().size() == 0)
            i = runtime.identity.createModel("Default");
        else
            i = runtime.viewpoint.getIdentityRuntimeModels().get(0);
        
        if (runtime.viewpoint.getBehaviorRuntimeModels().size() == 0)
            b = runtime.behavior.createModel("Default");
        else
            b = runtime.viewpoint.getBehaviorRuntimeModels().get(0);
    }

    public void start() {
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContent(Request request) {
        int contentLength = request.getContentLength();
        logger.trace("Request length = "+contentLength);
        if (contentLength > 0) {
            byte[] data = new byte[contentLength];
            int offset = 0;
            InputStream is = request.getInputStream();
            while (offset < contentLength) {
                int readNow;
                try {
                    readNow = is.read(data, offset, contentLength - offset);
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
                if (readNow == -1)
                    break; // Unexpected EOF?
                offset += readNow;
            }
            String s;
            try {
                s = new String(data, "UTF-8");
                logger.trace("Content received: [" + s + "]");
                return s;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
    
    
    public static void writeEmpty(Response response) throws IOException  {
        response.setContentType("text/plain");
        response.getWriter().write("{}");
        response.getWriter().close();
    }
        
    public void service(Request request, Response response) throws Exception {
        
        // We receive events without subscription?
        // We receive events only with a subscription?

        String content = getContent(request);
        
        try {

            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> jsonData = null;
            if (content == null || content.length() == 0) {
                writeEmpty(response);
                return;                        
            } else {
                jsonData = mapper.readValue(content, Map.class);            
            }
            logger.debug(content);
            
            /*
            logger.debug("JSON data:"); for (Entry<String, Object> entry :
            jsonData.entrySet()) {
            logger.debug("- "+entry.getKey()+": "+entry.getValue()); }

            Connect to Broker (address, clientId) 
            Subscribe to Topic (clientId, access, topic) 
            Publish Message to Topic (clientId, access, topic, payload)
            Deliver Message to Subscriber(clientId, access, topic)
            */ 

            
            // Finding/creating behavior instance
            // TODO: Behavior name is the clientId, this should be fixed
            String behaviorName = (String)jsonData.get("clientId");
            // If not defined use a default behavior name
            if (behaviorName == null) {
              behaviorName = "Undefined";   
            }
            // Find the behavior instance using the hard coded clientId        
            Behavior behavior = runtime.behavior.findBehavior(behaviorName);
            // If behavior instance not found create it
            if (behavior == null) {                
                String behaviorTypeName = (String)jsonData.get("behaviorType");
                if (behaviorTypeName == null) {
                    behaviorTypeName = "Undefined";
                }
                BehaviorType behaviorType = design.behavior.behaviorType.find(behaviorTypeName);
                if (behaviorType == null) {
                    BehaviorDesignModel model = design.behavior.createModel("Default");
                    BehaviorTypePackage pkg = design.behavior.typePackage.create(model, null, "Default");
                    behaviorType = design.behavior.behaviorType.create(pkg, behaviorTypeName, null);
                }            
                behavior = runtime.behavior.createBehavior(b, behaviorType, null, behaviorName);
            }


            // Finding/creating activity type
            String activityTypeName = (String)jsonData.get("activityType");
            //What if not found?
            
            
            ActivityType activityType = null;
            Activity activityInst = null;
            if (activityTypeName != null) {
                
                // Find the action or interaction type
                ActionType aType = design.behavior.actionType.getActionTypes().get(activityTypeName);
                InteractionType iType = design.behavior.interactionType.getInteractionTypes().get(activityTypeName);
                
                ActivityEvent event = null;
                DigitalIdentity clientId = null;
                if(aType!=null || iType!=null) {            
                    if (aType != null) {
                        logger.info("Action event received [" + aType.getName() + "]");
                        Action aInst = runtime.behavior.createAction(aType);
                        activityType = aType;
                        activityInst = aInst;
                        event = runtime.rule.createActionEvent(r, aInst, null, behavior);                    
                    } 
                    if (iType != null) {
                        logger.info("Interaction event received [" + iType.getName() + "]");
                        Interaction iInst = runtime.behavior.createInteraction(iType);
                        activityType = iType;
                        activityInst = iInst;
                        event = runtime.rule.createInteractionEvent(r, iInst, null, behavior);
                    }     

                    logger.debug("Identity instances");
                    for (IdentityInstantiation inst : activityType.getIdentityInstantiations()) {
                        Object obj = jsonData.get(inst.getName());
                        if (obj != null) {                    
                            // Did we see this identity in the past already?
                            DigitalIdentity id = runtime.identity.findDigitalIdentity(obj.toString());
                            if (id == null) {
                                IdentityType idType = design.identity.type.find("MQTT Identity");
                                if (idType != null) {
                                    id = runtime.identity.createDigitalIdentity(i, null, null, idType, obj.toString());                                    
                                    if (id == null) {
                                        logger.warn("- Error creating identity for [" + inst.getName() + "]");
                                        continue;
                                    }
                                } else {
                                    logger.warn("- MQTT Identity type not found for [" + inst.getName() + "]");
                                }
                            }
                            id.setInstantiation(inst);
                            logger.debug("- " + inst.getName() + " = [" + id.getSubject()+ "]");
                            activityInst.getIdentities().add(id);
                            if (inst.getName().equals("clientId")) {
                                clientId = id;
                            }                              
                        } else {
                            logger.warn("- Missing identity value for [" + inst.getName() + "]");
                        }
                    }    
                    
                    logger.debug("Data instances");
                    for (DataInstantiation inst : activityType.getDataInstantiations()) {
                        Object obj = jsonData.get(inst.getName());
                        if (obj != null) {
                            Data d = runtime.data.createData(dm, obj.toString(), inst, inst.getType());
                            d.setInstantiation(inst);
                            activityInst.getData().add(d);
                            logger.debug("- " + inst.getName() + " = [" + d.getStringValue() + "]");
                        } else {
                            logger.warn("- Missing data value for [" + inst.getName() + "]");
                        }
                    }
                    
                    if (clientId != null) {
                        IdentityOwner idOwner = clientId.getOwner();
                        if (idOwner != null) {
                            if (idOwner instanceof Entity) {
                                Entity entity = (Entity)idOwner;
                            }
                        }
                    }
                    
                    /*
                    if (clientId.getOwner())                
                        String behaviorTypeName = (String)jsonData.get("behaviorType");
                    if (behaviorTypeName != null) {
                    } else {
                    }                
                    */
                    
                    
                    behavior.getActivities().add(activityInst);
                    // logger.trace(ECoreUtils.objectToJson(event));
                    
                    Authorization auth = runtime.rule.notifyEvent("RuleRuntimeControllerHttpAdaptor", event);
                    logger.debug("Authorization: "+auth.getClass().getSimpleName());

                    event.setAuthorization(auth);
                    r.getEventSet().getEvents().add(event);
                    
                    response.setContentType("text/plain");
                    if (auth != null) {                    
                        String res = ECoreUtils.objectToJson(auth);
                        // logger.trace(res);
                        response.getWriter().write(res);
                        response.getWriter().close();
                        return;
                    }
                    
                } else {
                  logger.warn("Activity type received not found in design model [" + activityTypeName + "]");
                }            
            } else {
                logger.warn("NULL activity type received in event");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        writeEmpty(response);
        
        /*
         * try { Allow allow = (Allow)ruleTemplate.getAuthorization();
         * //allow.setRuleTemplate(null);
         * System.out.println(ECoreUtils.objectToJson
         * (ruleTemplate.getAuthorization()));
         * System.out.println(ECoreUtils.objectToJson(allow));
         * System.out.println(ECoreUtils.objectToXmlString(allow, "teste.xml"));
         * System.out.println(ECoreUtils.objectToXmlString(allow, "teste.xmi"));
         * if (true) System.exit(0); } catch (Exception e) { // TODO
         * Auto-generated catch block e.printStackTrace(); if (true)
         * System.exit(0); }
         */

    }


}
