package ict.kosovo.growth.oop.class_and_object_1;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month=month;
        this.year=year;
    }

    public void showDate() {
        System.out.printf("%d.%d.%d%n",day,month,year);
    }

    public void setDay(int day) {
        this.day=day;
    }
}
