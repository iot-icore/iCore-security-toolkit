package seckit.gui;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import models.Diagram;
import models.ModelsFactory;
import models.Shape;
import seckit.gui.design.DesignViewpointFactory;
import structure.StructuralDesignModel;
import structure.instantiation.EntityInstantiation;
import behavior.BehaviorDesignModel;
import behavior.instantiation.BehaviorInstantiation;
import behavior.type.AbstractBehaviorType;
import behavior.type.BehaviorType;
import behavior.type.BehaviorTypePackage;

public class VisualModelGenerator {

    public static void renderDiagram(PrintWriter writer, Diagram diagram) {
        
        writer.println("var graph = new joint.dia.Graph;");
        writer.println("var paper = new joint.dia.Paper({");
        writer.println("    el: $('#paper'),");
        writer.println("    width: 1200,");
        writer.println("    height: 800,");
        writer.println("    gridSize: 1,");
        writer.println("    model: graph");
        writer.println("});");
        writer.println("");
        
        for (Shape shape : diagram.getShapes()) {
            renderShape(writer, shape);
        }
        
    }
    
    public static void renderShape(PrintWriter writer, Shape shape) {

        // Render child shapes
        for (Shape cShape : shape.getContainedShapes()) {
            renderShape(writer, cShape);           
        }
        
        // Render parent shape
        writer.println("");
        writer.println("var shape"+shape.getElement().getId()+" = new joint.shapes.basic.Rect({");
        writer.println("    position: { x: "+shape.getX()+", y: "+shape.getY()+" },");
        writer.println("    size: { width: "+shape.getWidth()+", height: "+shape.getHeight()+" },");
        writer.println("    attrs: {"); 
        writer.println("      rect: { fill: '#CEF6E3' },"); 
        writer.println("      text: { text: '"+shape.getLabel()+"' }");
        writer.println("    }");
        writer.println("});");
        writer.println("");        
        
        // Embed child shapes
        for (Shape cShape : shape.getContainedShapes()) {
            writer.println("shape"+shape.getElement().getId()+".embed(shape"+cShape.getElement().getId()+");");
        }
        
        // add parent shape
        writer.println("graph.addCell(shape"+shape.getElement().getId()+");");
        writer.println("");        
        
        /*
        writer.println("");
        writer.println("var shape"+name+" = new joint.shapes.devs.Atomic({");
        writer.println("    attrs: { '.label': { text: '"+type.getName()+"' }},");
        writer.println("    size: { width: 90, height: 90 },");
        writer.println("    position: { x: "+x+", y: "+y+" },");
        StringBuffer b = new StringBuffer();
        boolean first = true;
        for (AbstractInteractionContributionOfType icOfType : type.getContributions()) {
            if (first) {
              first = false;
            } else {
               b.append(", ");
            }
            b.append("'"+icOfType.getRole()+"'");            
        }
        writer.println("    inPorts: ["+b.toString()+"],");
        writer.println("    outPorts: []");
        writer.println("});");
        */
        
    }
    
    
    static int wlim = 600;
    static int w=100;
    static int h=50;
    static int hgap = 10;
    static int vgap = 10;
    static int x = hgap;
    static int y = vgap;

    
    public static Shape generateShape(Shape pShape, BehaviorType type) {
        
        Shape shape = ModelsFactory.eINSTANCE.createShape();
        shape.setElement(type);
        shape.setElement(type);
        shape.setLabel(type.getName());
        
        if (type.getContainedInstantiations().size() > 0) {
            //x = hgap;
            // y = y + h + vgap;
            for (BehaviorInstantiation inst : type.getContainedInstantiations()) {
                if (inst.getType() instanceof BehaviorType) {
                    Shape cShape = generateShape(shape, (BehaviorType)inst.getType());
                    shape.getContainedShapes().add(cShape);
                }
            }
        }

        shape.setX(x);
        shape.setY(y);
        w = type.getName().length() * 9;
        shape.setWidth(w);
        shape.setHeight(h);
        
        //
        x = x + w + hgap;
        if (x > wlim) {
            x = hgap;
            y = y + h + vgap;
        }
        //
        
        return shape;       
    }
    
    public static void generateDiagram(BehaviorType type) {


        Diagram diagram = ModelsFactory.eINSTANCE.createDiagram();
        Shape shape = generateShape(null, type);
        diagram.getShapes().add(shape);
        
        
        PrintWriter writer;
        try {
            writer = new PrintWriter("./htdocs/gui/" + type.getName() + ".js");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }
        renderDiagram(writer, diagram);
        writer.close();
    }

    public static void generateDiagram(DesignViewpointFactory design) {
        // Generate behavior diagrams for all possible instantiations
        for (StructuralDesignModel structuralModel : design.viewpoint.getStructuralDesignModels()) {
            for (EntityInstantiation inst : structuralModel.getAllowedEntityInstantiations()) {
                for (BehaviorDesignModel behaviorModel : design.viewpoint.getBehaviorDesignModels()) {
                    for (BehaviorTypePackage pkg : behaviorModel.getPackages()) {
                        for (AbstractBehaviorType type : pkg.getBehaviorTypes()) {
                            if (type.getEntityType().getId().equals(inst.getType().getId())) {
                                if (type instanceof BehaviorType) {
                                    System.out.println(type.getName());
                                    generateDiagram((BehaviorType) type);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
