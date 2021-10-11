package ict.kosovo.growth.oop.association_composition_aggregation;

public class Mouse {
    private String company;
    private String color;
    private Battery battery; // u kriju association - relacioni mes klasave

    public Mouse(Battery battery) {
        this.battery=battery;
    }
}
