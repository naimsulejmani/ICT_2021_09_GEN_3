package ict.kosovo.growth.advance.file_io;

import java.io.*;

public class BasicBinaryReadWriteFile {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("files/inFileIO.pptx");
             OutputStream out = new FileOutputStream("files/outFileIO.pptx")
        ) {
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                    out.write(buffer,0,length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
