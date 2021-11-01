package ict.kosovo.growth.advance.nested_class.static_context;

public class Outer {
    //Inner inner;
    public static class Inner {
        public int value = 100;
    }

    private static class PrivateClass {
        private String name = "I am a private class!";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PrivateClass(String message) {
            this.name=message;
        }

        @Override
        public String toString() {
            return "PrivateClass{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static PrivateClass createInstance(String message) {
        return new PrivateClass(message);
    }
}
