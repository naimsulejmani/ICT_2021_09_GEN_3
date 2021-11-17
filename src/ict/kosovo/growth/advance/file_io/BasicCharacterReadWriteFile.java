package ict.kosovo.growth.advance.file_io;

import java.io.*;
import java.nio.charset.Charset;

public class BasicCharacterReadWriteFile {
    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");
        try (
                Reader in = new FileReader("files/product_manager.txt", utf8);
                Writer out = new FileWriter("files/out_product_manager.txt", utf8)
        ) {
            char[] buffer = new char[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
