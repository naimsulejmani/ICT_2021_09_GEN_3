package ict.kosovo.growth.oop.association_composition_aggregation;

import java.time.LocalDate;

public class CourseStudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Aladin","Bajra", LocalDate.now().minusYears(20));
        Student s2 = new Student("Albina", "Ahmeti", LocalDate.now().minusDays(3).minusYears(18));
        Course java = new Course("Java and Android",1);
        java.enrollStudent(s1);
        java.enrollStudent(s2);

    }
}
