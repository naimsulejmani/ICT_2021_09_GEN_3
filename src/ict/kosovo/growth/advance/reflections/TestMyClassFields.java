package ict.kosovo.growth.advance.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class TestMyClassFields {
    public static void main(String[] args) {
        System.out.println("All Accessible field of MyClass");
        Field[] accessibleFields = MyClass.class.getFields();


        System.out.println("Declared fields of MyClass");
        Field[] declaredFields = MyClass.class.getDeclaredFields();
        for(Field f: declaredFields) {
            String modifiers = Modifier.toString(f.getModifiers());
            String fieldName = f.getName();
            String typeName = f.getType().getSimpleName();
            System.out.printf("%s %s %s;%n", modifiers,typeName,fieldName);
        }
    }
}
