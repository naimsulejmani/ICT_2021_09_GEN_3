package ict.kosovo.growth.advance.reflections;

public class ArrayReflections {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class intA = int[].class;
        Class intA2d = int[][].class;
        Class intA3d = Class.forName("[[D");

        Class v1Class = Class.forName("ict.kosovo.growth.advance.reflections.Vetura");
        Vetura vetura1 = (Vetura) v1Class.newInstance();
        vetura1.setModel("BMW");

        System.out.println(vetura1.getModel());

    }
}
