package ict.kosovo.growth.oop.ushtrime_3;

public enum DistanceUnit {
    MM("Mili meter"),
    CM("Centi meter"),
    M("Meter"),
    KM("Kilo meter");

    private String njesia;

    DistanceUnit(String njesia) {
        this.njesia = njesia;
    }

    public String getNjesia() {
        return njesia;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",super.toString(),getNjesia());
    }
}
