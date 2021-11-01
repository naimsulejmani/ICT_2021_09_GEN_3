package ict.kosovo.growth.advance.nested_class.local_context;

public class TestLocalContext {
    public static void main(String[] args) {
        class Personi {
            public String name;
            public  int age;
        }
        Personi p = new Personi();
        p.age=20;
        p.name="filane";
    }

    static void test() {
      //Personi p ; //nuk lejohet
    }
}
