package thinkinjava.exception_section;

import thinkinjava.PrintUtils;

import java.util.logging.Logger;

 class LoggingException extends Exception{

    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        printStackTrace();
        logger.severe("");
    }
}

public class LoggingExceptions extends Exception{

     public static void main(String[] args) {
         try {
             throw new LoggingException();
         } catch (LoggingException ex) {
             PrintUtils.println("Caught " + ex);
         }

         try {
             throw new LoggingException();
         } catch (LoggingException ex) {
             PrintUtils.println("Caught " + ex);
         }
     }


}
