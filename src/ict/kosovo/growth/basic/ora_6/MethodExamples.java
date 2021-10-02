package ict.kosovo.growth.basic.ora_6;

public class MethodExamples {
    public static void main(String[] args) {
        System.out.println(max(20, 100));
        int m = max(1009, 999) + 100;
        System.out.println(m);
        max(300, 200);

        int nr1 = 100;
        short nr2 = 200;
        double nr3 = 300.4;

        double minimumi = min(nr3, nr1);

        sayHelloTo("Shkelqim");
        System.out.println("Hello Alban");
        sayHelloTo("Donjeta");



    }

    private static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
        //sayHelloTo(name);
    }

    private static int max(int x, int y) //ketu gjuhen gabimet lista gabimeve
    {
        //nuk guxon te kete rruge e cila nuk kthen vlere te tipit (int) sikurse eka return-type
        if (x > y) return x;
        else return y;
    }

    //nenshkrimi i metodes
    private static int min(int x, int y) {
        return x < y ? x : y; //ternary operator ?:   min(int, int)
    }

    //emri i njejte - overload method
    // numri i parametrave a eshte i njetje - 2 po
    // tipi a eshte i njejte jo -
    private static double min(double x, double y) {
        return x < y ? x : y;
    }

    private static double min(double x, int y) {
        return x < y ? x : y;
    }

    //min(int, short)
    private static int min(int x, short y) {
        return x < y ? x : y;
    }

    //min(int, short)
//    private static int min(int x1, short y1) {
//        return x1<y1 ? x1:y1;
//    }

    //dallon renditja e paraemtrave
//min(short, int)
    private static int min(short y, int x) {
        return x < y ? x : y;
    }

}
