package ict.kosovo.growth.advance.nested_class.static_context;

import ict.kosovo.growth.advance.nested_class.static_context.Outer;

public class TestOuterInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        var privateClass = Outer.createInstance("Tung Naim");
        System.out.println(privateClass);
        System.out.println(inner.value);
    }
}
