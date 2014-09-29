/**
 * @author nates
 */
package beerwench.beerxml2.viewer;


import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppProperties {
    
    public Properties appProperties;
    private Properties defaultProperties;
    
    private Executor theExecutor;
    
    private static Logger logger = Logger.getLogger(AppProperties.class.getName());

    AppProperties(){
        logger.log(Level.FINER, "Created AppProperties object");
        loadProperties();
        
        int threadNumber = Integer.parseInt(appProperties.getProperty("threadPoolSize"));
        
        if (threadNumber > 0) {
            theExecutor = Executors.newFixedThreadPool(threadNumber);
        }
        else {
            theExecutor = Executors.newFixedThreadPool(10);
        }
    }

    Properties getProperties() {
        return appProperties;
    }

    String getProperty(String key) {
            return appProperties.getProperty(key);
    }
    
    void setProperty(String key, String value) {
        appProperties.setProperty(key, value);
    }
    
    void loadProperties(){
        //load the default properties and then the users properties
        //if successful set the class variables
        Properties defaultProps = new Properties();
        
        try {
            //FileInputStream in = new FileInputStream("defaultProperties");
            FileInputStream in = new FileInputStream(new File("etc/defaultProperties"));
            defaultProps.load(in);
            in.close();
            // create application properties with default
            Properties applicationProps = new Properties(defaultProps);
            
            // now load properties from last invocation
            in = new FileInputStream("etc/appProperties");
            applicationProps.load(in);
            in.close();

            appProperties = applicationProps;
            logger.log(Level.INFO, "Successly loaded appProperties");
        }
        catch(FileNotFoundException fnf){
            logger.log(Level.WARNING,"Unable to locate properties file...",fnf);
        }
        catch(IOException io){
            logger.log(Level.WARNING,"Unable to load properties file...",io);
        }
    }

    void saveProperties() {
        try {
            FileOutputStream out = new FileOutputStream("etc/appProperties");
            appProperties.store(out, "---No Comment---");
            out.close();
        }
        catch(FileNotFoundException fnf){
            logger.log(Level.WARNING,"Unable to locate properties file...",fnf);
        }
        catch(IOException io){
            logger.log(Level.WARNING,"Unable to save properties file...",io);
        }
    }
 
    void launchExecutable(String fileExe) {
        //add launch duplication protection here
            theExecutor.execute(ThreadedExec.start(fileExe));
    }
}
