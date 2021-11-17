package ict.kosovo.growth.advance.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoication {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Profesori> profesoriClass = Profesori.class;
        Constructor<Profesori> constructor = profesoriClass.getConstructor();
        Object object = constructor.newInstance();
        Method method = profesoriClass.getMethod("setName", String.class);
        method.invoke(object, "Naim");

        Method method1 = profesoriClass.getMethod("getName");
        System.out.println(method1.invoke(object));

    }
}
