package ict.kosovo.growth.oop.arrays_example;

public class TodoTest {
    public static void main(String[] args) {
        Todo todo1 = new Todo("Shko luaj futboll ne termin prej 17:00");
        Todo todo2 = new Todo("Mbaj mesim online");
        todo1.changeStatus();
        todo1.print();
        todo2.print();
    }
}
