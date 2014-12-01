package seckit.gui;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

public class Controller {
    
    String name;
    
    public Controller(String name) {       
        this.name = name;
    }
    
    public static void addMessage(EList<?> list, List<String> msgs, String msg) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                msgs.add("- (1) "+msg);
            } else {
                msgs.add("- ("+size+") "+msg+"s");
            }
        }
    }
    
    public static void printMessages(Logger logger, List<String> msgs) {
        for (String msg : msgs) {
            logger.debug(msg);
        }
    }


}
