
package beerwench.beerxml2.viewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */

/**
 * @author nate
 *
 */
public class ThreadedExec extends Thread {

    private Process process;
    private BufferedReader outstream;
    private BufferedReader errorstream;
    private String theCommand;
    //private Thread t;
    
    
    private static Logger logger = Logger.getLogger(ThreadedExec.class.getName());
    
    public static ThreadedExec start(String command) {
        try {
            Process started = Runtime.getRuntime().exec(command);
            return new ThreadedExec(command, started);
        }
        catch(IOException exp) {
            logger.log(Level.SEVERE, "Error launching: "+command);
        }
        return null;
    }
    
    private ThreadedExec(String command, Process p) {
        theCommand = command;
        process = p;
        outstream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        errorstream = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        setDaemon(true);
    }
    
 public void run() {
     while(true) {
         try {
          //check the stdout stream and log anything that gets written
          while(outstream.ready()) {
              String line = outstream.readLine();
              if(line != null) {
                  logger.log(Level.INFO, "Executable" + theCommand + " said... \n"+ line);
              }
          }
          //check the stderr stream and log anyting that gets written
          while(errorstream.ready()) {
              String line = errorstream.readLine();
              if(line != null) {
                  logger.log(Level.INFO, "Executable" + theCommand + " said... \n"+ line);
              }
          }
      }
      catch (IOException io) {
          logger.log(Level.SEVERE, "Exception caught", io);
      }
      
      try {
          //TODO add intelligence to rsh, run ps and check the state of remote processes
          int exitValue = process.exitValue();
          logger.log(Level.INFO, "Process "+theCommand+" has exited.");
          return;
      }
      catch(IllegalThreadStateException tse){
       //this is caught when the process hasn't exited
          //no logging here as this happens every second
      }
      try {
          //Sleep for a second
          Thread.sleep(1000);
      }
      catch (InterruptedException exp) {
          
      }
     }
 }
}
