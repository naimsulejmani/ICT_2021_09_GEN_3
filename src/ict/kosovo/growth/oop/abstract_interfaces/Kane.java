package ict.kosovo.growth.oop.abstract_interfaces;

public class Kane extends Wrestler{

    public Kane(){
       // super();
        System.out.println("Kane constructor called");
    }


    @Override
    public void themeMusic() {
        System.out.println("Kane theme music");
    }

    @Override
    public void finisher() {
        System.out.println("Kane finishing....");
    }
}
