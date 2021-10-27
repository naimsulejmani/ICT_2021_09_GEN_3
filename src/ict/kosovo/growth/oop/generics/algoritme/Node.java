package ict.kosovo.growth.oop.generics.algoritme;

public class Node<T> {
    private T data; //e dhena qe ka me u ruajt
    private Node<T> next; //nyja e rradhes qe vjen
    private Node<T> prev; //nyja paraprake prej nga vij

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void print() {
        System.out.printf("Node:%s <--%s|%s|%s-->",this,prev,data,next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
