package ict.kosovo.growth.oop.interfaces;

public class CocaCola implements Perishable{
    @Override
    public void perish() {
        System.out.println("IS Perished");
    }

    @Override
    public boolean isPerished() {
        return false;
    }
}
