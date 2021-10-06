package ict.kosovo.growth.oop.class_and_object_1;

import java.util.Scanner;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate datalindjaX = new MyDate(10,1,1970);
        MyDate datalindjaY = new MyDate(23,10,2021);
        datalindjaX.showDate();
        datalindjaY.showDate();
        int day1, day2,day3, month1,month2,month3,year1, year2,year3;
        day1=10;
        month1=1;
        year1=1970;
        Scanner reader = new Scanner(System.in);

        System.out.println("BEFORE method call= "+day1);
        changePrimitive(day1);
        System.out.println("AFTER method call= "+day1);

        System.out.println("DATE BEFORE method call");
        datalindjaX.showDate();
        changeReference(datalindjaX);
        System.out.println("DATE AFTER method call");
        datalindjaX.showDate();
    }

    //pass by value
    public static void changePrimitive(int day) {
        day = 100;
    }
    //pass by reference
    public static void changeReference(MyDate date) {
        date.setDay(30);
    }
}
