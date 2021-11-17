package ict.kosovo.growth.advance.file_io;

import java.io.*;
import java.nio.charset.Charset;

public class BasicBufferReadWriteFileWithStreams {
    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("files/test.txt")));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("files/out-test.txt")))
        ) {
            String line = null;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
