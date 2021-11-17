package ict.kosovo.growth.advance.reflections;

public class Vetura {
    private int nrShasise;
    protected String model;

    public Vetura(int nrShasise, String model) {
        this.nrShasise = nrShasise;
        this.model = model;
    }
    public Vetura() {

    }

    public int getNrShasise() {
        return nrShasise;
    }

    public void setNrShasise(int nrShasise) {
        this.nrShasise = nrShasise;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
