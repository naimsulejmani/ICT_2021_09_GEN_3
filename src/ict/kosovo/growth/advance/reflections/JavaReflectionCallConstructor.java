package ict.kosovo.growth.advance.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class JavaReflectionCallConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Vetura> constructor = Vetura.class.getConstructor(int.class,String.class);
        Vetura vetura =  constructor.newInstance(1,"Mercedes");
        System.out.println(vetura.getModel());

        Field[] fields = Vetura.class.getDeclaredFields();

        for(Field field: fields) {
            int modifier = field.getModifiers();
            System.out.println(Modifier.toString(modifier));
        }

    }
}
