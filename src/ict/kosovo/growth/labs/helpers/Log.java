package ict.kosovo.growth.labs.helpers;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

//kjo klase ka me i kry sherbimet qe kane te bjene me kriju logger, dhe me shkru mesazh
public class Log {
    public Logger logger;// blank logger -> null
    FileHandler fileHandler;

    public Log(String fileName) throws IOException {
        logger = Logger.getLogger(Log.class.getName());
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger.addHandler(fileHandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public Log(String fileName, String loggerName) throws IOException {
        logger = Logger.getLogger(loggerName);
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger.addHandler(fileHandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public Log(String fileName, String loggerName, Level minimumLevel) throws IOException {
        logger = Logger.getLogger(loggerName);
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger.addHandler(fileHandler);

        logger.setLevel(minimumLevel);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public Log(String fileName, String loggerName, Level minimumLevel,
               Formatter formatter) throws IOException {
        logger = Logger.getLogger(loggerName);
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger.addHandler(fileHandler);

        logger.setLevel(minimumLevel);
        fileHandler.setFormatter(formatter);
    }

}
