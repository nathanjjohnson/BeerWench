/**
 * 
 */
package beerwench.beerxml2.viewer;

import java.util.Stack;
import java.util.logging.*;
/**
 * @author nate
 *
 */
public class CommandInvoker {

    private static Logger logger = Logger.getLogger(CommandInvoker.class.getName());
    private Stack<Command> commandStack;
    private Command currentCommand;

    /**
     * 
     */
    public CommandInvoker() {
    	logger.log(Level.FINER, "Created CommandInvoker object");
        commandStack = new Stack<Command>();
        currentCommand = null;
    }
    
    /**
     * 
     * @param c
     */
    public void setCommand(Command c) {
        currentCommand = c;
    }
    
    /**
     * 
     */
    public void run() {
        // TODO Check for null pointer exception
        currentCommand.execute();
        commandStack.add(currentCommand);
        currentCommand = null;
    }
    
    /**
     * 
     */
    public void undo() {
        // TODO Check for null pointer exception
        currentCommand = commandStack.pop();
        currentCommand.execute();
        currentCommand = null;
    }
    
    
}
