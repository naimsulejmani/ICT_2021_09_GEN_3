package ict.kosovo.growth.advance.reflections;

import java.time.LocalDate;

public class ProfesoriClassExampleWeb {
    public static void main(String[] args) {
        Profesori profesori =new Profesori(1,"Naim","Sulejmani", LocalDate.now());

        System.out.println(profesori.getSelectHtmlHelper());
    }
}
