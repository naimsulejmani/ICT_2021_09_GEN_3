package ict.kosovo.growth.advance.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestVeturaClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Vetura[] veturat = new Vetura[10];
        Class<Vetura> c = Vetura.class;

        System.out.println("IsEnum = " + c.isEnum());
        System.out.println("IsInterface = " + c.isInterface());

        Class c1 = veturat.getClass();
        System.out.println("Vetura[] isArray = " + c1.isArray());

        Field[] dataAttributesOfVetura = c.getDeclaredFields();

        for (Field field: dataAttributesOfVetura
             ) {
            System.out.println(field);
        }

        Method[] methodsOfVetura = c.getDeclaredMethods();
        for(Method m: methodsOfVetura) {
            System.out.println(m);
        }


        Constructor[] constructorsOfVetura = c.getConstructors();
        for(Constructor constructor: constructorsOfVetura) {
            System.out.println(constructor);
        }

        Class<Vetura> veturaClass= (Class<Vetura>) Class.forName("ict.kosovo.growth.advance.reflections.Vetura");
        System.out.println(veturaClass.getName());
        System.out.println(veturaClass.getSimpleName());

        System.out.println("-----------");
        printObjectClassName(new Vetura(1,"Naim"));


        Class t = int.class;
        System.out.println(t.getName());
        System.out.println(t.getSimpleName());
    }

    static void printObjectClassName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
    }
}
