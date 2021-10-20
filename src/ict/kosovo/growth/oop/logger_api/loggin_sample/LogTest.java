package ict.kosovo.growth.oop.logger_api.loggin_sample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.XMLFormatter;

public class LogTest {
    public static void main(String[] args) {
        try {
            Log logInfo = new Log("files/info.txt");
            logInfo.logger.severe("SEVER LOG");

            Log productLog = new Log("files/product_log.txt","PRODUCT_LOG_LOGGER");
            productLog.logger.warning("AFATI I SHKURTE I SKADENCES");

            Log testLog = new Log("files/testlog.txt","TEST_LOG", Level.WARNING,new XMLFormatter());
            testLog.logger.info("NUK E RUAN KETE");
            testLog.logger.severe("E RUAN KETE");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
