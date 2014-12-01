package seckit.gui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import models.Model;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import seckit.impl.SystemDesignViewpointImpl;
import seckit.impl.SystemRuntimeViewpointImpl;

public class Icons {

    private static Logger logger = Logger.getLogger(Icons.class.getName());
    private static Map<String, Icon> iconToClass = new HashMap<String, Icon>();
    private static Map<String, Icon> pathToIcon = new HashMap<String, Icon>();

    static {
        addIcon(Object.class, "condition.png");
        addIcon(String.class, "condition.png");
        addIcon(Model.class, "models.png");
        addIcon(EObjectContainmentEList.class, "models.png");
        addIcon(EObjectContainmentEList.class, "models.png");
        addIcon(SystemDesignViewpointImpl.class, "models.png");
        addIcon(SystemRuntimeViewpointImpl.class, "models.png");
    }

    public static Icon addIcon(Class<?> c, String path) {
        Icon icon = createIcon(path);
        iconToClass.put(c.getSimpleName(), icon);
        return icon;
    }

    // Returns an ImageIcon, or null if the path was invalid
    public static Icon createIcon(String path) {
       path = "icon/" + path;
       Icon icon = pathToIcon.get(path);
       if (icon == null) {
           java.net.URL imgURL = Icons.class.getResource(path);
           if (imgURL != null) {
               icon = new ImageIcon(imgURL);
           }
           pathToIcon.put(path, icon);
       }
       return icon;
    }

    public static Icon getIcon(Object obj) {
        Icon i;
        Class<?> c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            c = (Class<?>) obj;
        } else {
            c = obj.getClass();
        }
        i = iconToClass.get(c.getSimpleName());

        if (i == null) {
            logger.warn("Icon not found! [" + obj.getClass().getSimpleName() + "]  [" + obj + "], using default");
            logger.warn("  Icons.addIcon(" + obj.getClass().getSimpleName() + ".class, \"path\");");
            addIcon(obj.getClass(), "default.png");
            return iconToClass.get(c.getSimpleName());
        }
        return i;
    }

}
