package ict.kosovo.growth.oop.logger_api;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

//log_2021_10_20.txt
//log_2021_10_21.txt
public class TestFileHandler {
    private static Logger logger = Logger.getLogger(TestFileHandler.class.getName());
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("files/log.txt",true);
            logger.addHandler(fileHandler);

           for(int i =0; i<10;i++){
               logger.warning("WARN ABOUT YOU: "+i);
               logger.severe("HELLO I'M KIDDING: "+i);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
