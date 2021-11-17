package ict.kosovo.growth.advance.file_io.serializable_example;

import java.io.*;
import java.time.LocalDate;

public class TestPersonSerializable {
    public static void main(String[] args) {
        Person person = new Person(1, "Naim", "Sulejmani", LocalDate.now());
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files/persons.bin"))
        ) {
            out.writeObject(person);
            person = null;
        } catch (NotSerializableException ex) {
            System.out.println(ex.getMessage());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
