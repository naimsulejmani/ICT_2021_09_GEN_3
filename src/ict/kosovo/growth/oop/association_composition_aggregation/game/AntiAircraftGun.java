package ict.kosovo.growth.oop.association_composition_aggregation.game;

// 1 target
public class AntiAircraftGun {
    //pozita GPS Latitude, Point
    private int x;
    private int y;

    private int damage = 0;

    private Bomber target; //null

    public AntiAircraftGun(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setTarget(Bomber target) {
        this.target = target;
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
