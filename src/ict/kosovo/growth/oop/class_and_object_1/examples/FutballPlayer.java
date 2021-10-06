package ict.kosovo.growth.oop.class_and_object_1.examples;

public class FutballPlayer {
    private int no;
    private String name;
    private String surname;
    private String nickname;
    private String kembaPreferuar;
    private String club;
    //..defino sa ma shum

    //mundeni pa konstrukot

    public void setNo(int no) {
        if(no<0) {
            System.out.println("Nuk guxon te jete numer negative");
            return;
        }
        this.no = no;
    }

    public int getNo() {
        return no;
    }


}
