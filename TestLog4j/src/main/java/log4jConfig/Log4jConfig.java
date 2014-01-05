package log4jConfig;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Java program to configure log4j without using XML or properties file.
 * By using BasicConfigurator class, you can configure Log4j in one line.
 * @author
 */
public class Log4jConfig {
   private static final Logger logger = Logger.getLogger(Log4jConfig.class);
 
   public static void main(String args[]) {
     
     
       BasicConfigurator.configure(); //enough for configuring log4j
     
       Logger.getRootLogger().setLevel(Level.ALL); //changing log level
     
     
       logger.error("Critical message, almost fatal");
       logger.warn("Warnings, which may lead to system impact");
       logger.info("Information");
       logger.debug("Debugging information ");
          
   }    
 
}
