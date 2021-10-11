package ict.kosovo.growth.oop.association_composition_aggregation.game;

public class GameTest {
    public static void main(String[] args) {
        Bomber bomber = new Bomber(10,20);
        AntiAircraftGun aircraftGun = new AntiAircraftGun(20,10);

        bomber.setTarget(aircraftGun);
        aircraftGun.setTarget(bomber);

        bomber.hitTarget();

        aircraftGun.hitTarget();

        System.out.println("BOMBER DAMAGE = "+bomber.getDamage());
        System.out.println("ANTI AIRCRAFT GUN "+ aircraftGun.getDamage());
        aircraftGun.setTarget(null);
        aircraftGun.hitTarget();
    }
}
