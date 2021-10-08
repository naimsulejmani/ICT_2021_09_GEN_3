package ict.kosovo.growth.oop.class_and_object_2;

public class Counter {
    public static final int MAX_VALUE = 999;
    private int value; //=0

    public void inc() {
        if (value < MAX_VALUE)
            ++value;
    }

    public int getValue() {
        return value;
    }
}
