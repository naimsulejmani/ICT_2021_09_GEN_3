package ict.kosovo.growth.oop.generics.algoritme;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int counter = 0;
    //detyra e listes se nderlidhur osht mi ruajt keto referneca

    public LinkedList() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void removeFirst() {
        if(isEmpty()) {
            System.out.println("Nuk ka elemente per tu fshire!!!");
        }
        else {
                head = head.getNext();
                head.setPrev(null);
        }
    }

    public void print() {
        Node<T> curr = head;

        while(curr!=null) {
            System.out.printf("%8s",curr.getData());
            curr = curr.getNext();
        }

    }



}
