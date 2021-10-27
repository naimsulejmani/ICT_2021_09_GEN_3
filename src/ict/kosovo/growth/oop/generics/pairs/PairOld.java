package ict.kosovo.growth.oop.generics.pairs;

public class PairOld {
    private Object first;
    private Object second;

    public PairOld(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }
}
