package ict.kosovo.growth.oop.generics.algoritme;

public class TestNode {
    public static void main(String[] args) {
        Node<Integer> nyja1 = new Node<>(100);
        Node<Integer> nyja2 = new Node<>(200);

        Node<Integer> nyja15 = new Node<>(150);


        nyja1.setNext(nyja15);
        nyja15.setNext(nyja2);
        nyja15.setPrev(nyja1);
        nyja2.setPrev(nyja15);

        nyja1.getNext().getNext().getPrev().getPrev().getNext().print();
        System.out.println("\n-------------------------");

//        nyja1.setNext(nyja2);
//        nyja2.setPrev(nyja1);
        nyja1.print();
        System.out.println();
        nyja15.print();
        System.out.println();
        nyja2.print();

        System.out.println();
        System.out.println("Lista e nderlidhur");
        System.out.println("---------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(100);
        linkedList.addFirst(50);
        linkedList.addFirst(10);

        linkedList.print();
        System.out.println("E DYTA");
        linkedList.print();
    }
}
