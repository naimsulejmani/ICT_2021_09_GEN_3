package ict.kosovo.growth.oop.ushtrime_3;

import javax.swing.*;

public class PointTest {
    public static void main(String[] args) {
        Point pika1 = new Point(1,3);
        Point pika2 = new Point(3,2);


        System.out.printf("Distance eshte: %.3f %s",pika1.distantTo(pika2),pika1.getDistance());
    }
}
