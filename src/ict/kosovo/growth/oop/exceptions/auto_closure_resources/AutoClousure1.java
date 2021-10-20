package ict.kosovo.growth.oop.exceptions.auto_closure_resources;

import ict.kosovo.growth.oop.exceptions.Stack;

import java.io.*;

public class AutoClousure1 {
    public static void main(String[] args) {

        try (BufferedReader input = new BufferedReader(new FileReader("files/fajlli_in.txt"));
             PrintWriter output = new PrintWriter(new FileWriter("files/fajlli_out.txt"))
        ) {
            String line = input.readLine();
            output.println(line);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
