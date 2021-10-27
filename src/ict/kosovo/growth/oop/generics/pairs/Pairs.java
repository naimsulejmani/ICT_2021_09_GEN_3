package ict.kosovo.growth.oop.generics.pairs;

//T ,U ,V, E
public class Pairs<T,U> {
    private T first;
    private U second;

    public Pairs(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
