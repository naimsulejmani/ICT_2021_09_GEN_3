package ict.kosovo.growth.oop.ushtrime_3;

//Ndriqimit
public class Point {
    private double x;
    private double y;
    private DistanceUnit distance;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.distance = DistanceUnit.CM;
    }

    public Point(double x, double y, DistanceUnit distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distantTo(Point otherPoint) {
        double distanca = Math.sqrt(
                Math.pow((otherPoint.getX() - this.getX()), 2) -
                        Math.pow((otherPoint.getY() - this.getY()), 2)
        );
        return distanca;
    }

    public DistanceUnit getDistance() {
        return distance;
    }

}