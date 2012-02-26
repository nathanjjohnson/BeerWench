/**
 * 
 */
package beerwench.beerxml2.viewer;

import java.util.Stack;

/**
 * @author nate
 *
 */
public class CommandInvoker {

    private Stack<Command> commandStack;
    private Command currentCommand;

    /**
     * 
     */
    public CommandInvoker() {
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
        // TODO Check for nullpointerexception
        currentCommand.execute();
        commandStack.add(currentCommand);
        currentCommand = null;
    }
    
    /**
     * 
     */
    public void undo() {
        // TODO Check for nullpointerexception
        currentCommand = commandStack.pop();
        currentCommand.execute();
        currentCommand = null;
    }
    
    
}
