package ict.kosovo.growth.oop.association_composition_aggregation;

import java.util.ArrayList;

/*
        Detyre klase -> Zevendesoni Student[] -> ArrayList<Student>
 */
public class Course {
    private static int idGenerator = 0;
    private final int id;
    private String name;

    //private Student[] students; //1 kurs ka shume studente (1..*)
    private ArrayList<Student> students;//1 kurs ka shume studente (1..*)

    private final int MAX_STUDENTS;
    // private int noStudents;

    public Course(String name, int totalStudents) {
        if (totalStudents > 0) {
            MAX_STUDENTS = totalStudents;
        } else {
            MAX_STUDENTS = 100;
        }
        id = ++idGenerator;
        // students = new Student[MAX_STUDENTS];
        students = new ArrayList<>(MAX_STUDENTS);
        this.name = name;
        // noStudents = 0;
    }

    public void enrollStudent(Student student) {
//        if (noStudents < MAX_STUDENTS) {
//            students[noStudents++] = student;
//        }
        if (students.size() < MAX_STUDENTS) {
            students.add(student);
        } else {
            System.out.printf("Nuk ka vende te lira me!%n");
        }
        System.out.printf("Nga totali %d jane pranuar %d student. %n", MAX_STUDENTS, students.size());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalEnrolledStudentNo() {
        //return noStudents;
        return students.size();
    }
}
