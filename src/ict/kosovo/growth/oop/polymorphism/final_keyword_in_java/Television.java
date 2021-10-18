package ict.kosovo.growth.oop.polymorphism.final_keyword_in_java;

//nese nuk deshirojme klasa me pas mundesi me u trashegu (mos me pas femij)
public class Television {
    //java e ka nje rreugll kur perdoret si variabel instance (vepron si readonly ne C#)

    //vleren e pare qe e inicializojme ate e merr edhe pastaj vepron si konstante
    public final int id; //konstante

    //    {
//        id=20;//nuk mund te ndryshojme konstanten
//    }
    public Television() {
        this((int) (Math.random() * Integer.MAX_VALUE));
    }

    public Television(int id) {
        this.id = id;
    }

    //nese deshirojme qe femite e kesaj klase os me pas mundesi me ndryshu metoden e bejem final
    public final void turnOn() {
        System.out.println("Turned On");
    }

}
