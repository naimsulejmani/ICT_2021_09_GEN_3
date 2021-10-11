package ict.kosovo.growth.oop.association_composition_aggregation.game;

public class Bomber {
    //pozita GPS Latitude, Point
    private int x;
    private int y;

    private int damage = 0;
    private AntiAircraftGun target; //null

    public Bomber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setTarget(AntiAircraftGun target) {
        this.target= target;
    }

    public void setDamage(int damage) {
        this.damage += damage;
    }


    public int getDamage() {
        return damage;
    }
    public void hitTarget() {
        if (target == null) {
            System.out.println("Skam shenjester askend");
            return;
        }
        int rnd = (int)(Math.random()*100);

        if(rnd>50)
            target.setDamage((int)(Math.random()*100));
        else {
            System.out.println("You miss the target!!!");
        }

    }
}
