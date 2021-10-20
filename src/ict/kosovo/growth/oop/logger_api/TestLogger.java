package ict.kosovo.growth.oop.logger_api;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    private static Logger logger = Logger.getLogger(TestLogger.class.getName());

    public static void main(String[] args) {
        try{
            logger.setLevel(Level.SEVERE);
            throw new Exception("FIRE ALARM !!!!!");
        }
        catch (Exception ex) {
            logger.log(Level.SEVERE, "GUtu thirri zajrrfiksat");
        }
        finally {
            logger.log(Level.INFO,"NE RREGULL ESHTE tani");
            logger.info("kjo eshte e nejte");
            logger.warning("TEST");
        }
    }
}
