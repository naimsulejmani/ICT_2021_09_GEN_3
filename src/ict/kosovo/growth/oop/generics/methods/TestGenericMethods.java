package ict.kosovo.growth.oop.generics.methods;

public class TestGenericMethods {
    public static void main(String[] args) {
        //String[] emrat = {"Naim","Zana","Shpendi"};
        String mesiString = getMiddle("Naim","Filan","Fistek","Kosova","Shqiperia");
        System.out.println(mesiString);

        double mesiDouble = getMiddle(100d,200d,300d);
        System.out.println(mesiDouble);

        String iPari = getFirst("String",200,300);
        System.out.println(iPari);
    }

    //varargs
    public static <T> T getMiddle(T... args) {
        if (args.length == 0) return null;
        return args[args.length / 2];
    }

    public static <T,U> String getFirst(U elem,T... args) {
        if (args.length == 0) return null;
        return String.valueOf(args[0]);
    }

}
