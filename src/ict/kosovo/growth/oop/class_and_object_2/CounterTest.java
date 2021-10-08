package ict.kosovo.growth.oop.class_and_object_2;

public class CounterTest {
    public static void main(String[] args) {
        Counter countPeopleOnTheBus = new Counter();
        countPeopleOnTheBus.inc();
        countPeopleOnTheBus.inc();
        countPeopleOnTheBus.inc();
        countPeopleOnTheBus.inc();
        System.out.println(countPeopleOnTheBus.getValue());

        Counter countPassedExam = new Counter();
        countPassedExam.inc();
        countPassedExam.inc();
    }
}
