package ict.kosovo.growth.oop.ushtrime_3;

public enum DistanceUnit {
    MM("Mili meter",0.001d),
    CM("Centi meter",0.01d),
    M("Meter",1.0d),
    KM("Kilo meter",1000.0d);

    private String njesia;
    private double konvertimi;

    DistanceUnit(String njesia) {
        this.njesia = njesia;
    }
    DistanceUnit(String njesia, double konvertimi) {
        this.njesia=njesia;
        this.konvertimi=konvertimi;
    }

    public String getNjesia() {
        return njesia;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",super.toString(),getNjesia());
    }
}
