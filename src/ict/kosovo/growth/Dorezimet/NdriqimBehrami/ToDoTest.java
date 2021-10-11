package ict.kosovo.growth.Dorezimet.NdriqimBehrami;

import ict.kosovo.growth.oop.arrays_example.Todo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoTest {

    private static List<String> currentList = new ArrayList<String>();
    private static List<ToDo> currentList1 = new ArrayList<ToDo>();
    public static void main(String[] args) {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = ToDo.menu();
            switch (menuItem) {
                case 1:
                    shtoToDo();
                    break;
                case 2:
                    lexoToDo();
                    break;
                case 3:
                    fshiToDo();
                    break;
                case 4:
                    shtypGjithTodo();
                    break;
                case 5:
                    fshiToDoKomplet();
                    break;
                case 6:
                    gjejToDoEmer();
                    break;
                case 7:
                    shfaqTotalToDo();
                    break;
//                case 8:
//                    markSelectedToDo();
//                    break;
                case 0:
                    System.out.println("Aplikacioni po mbyllet!");
                    break;
                default:
                    System.out.println("Shkruani nje numer te vlefshem");
            }
        }
    }

//    public static void markSelectedToDo() {
//        System.out.println();
//        System.out.println("----------------------");
//        System.out.println("Cilen vlere deshironi ta beni mark: " + currentList);
//        Scanner reader = new Scanner(System.in);
//        int vlera = reader.nextInt();
//        char markSelected = 251;
//        System.out.println(markSelected);
//        int number = 0;
//        for (String item : currentList) {
//            System.out.println(++number + " " + item);
//            System.out.println();
//            System.out.println("----------------------");




    public static void shfaqTotalToDo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println(" Gjithe totali i todo-ve tuaja eshte: " + currentList.size());
        System.out.println();
        System.out.println("----------------------");
        System.out.println();

    }

    public static void fshiToDoKomplet() {

        System.out.println("jeni i sigurt qe doni te fshini gjithe to do, shtypni po ose jo");
        Scanner reader = new Scanner(System.in);
        String pergjigjja = reader.nextLine();
        if (pergjigjja.equalsIgnoreCase("po")) { // y/Y ose n/N
            System.out.println("Todo lista juaj eshte fshire me sukses"  ); currentList.clear();
        } else {
            System.out.println("Lista juaj eshte: " + currentList);
            System.out.println();
            System.out.println("----------------------");


        }
        System.out.println();
    }

    public static void gjejToDoEmer() {
        System.out.println("Shtypni emrin e todo qe deshironi te kerkoni: ");
        Scanner reader = new Scanner(System.in);
        String emriToDo = reader.nextLine();
        if (currentList.contains(emriToDo)) {
            System.out.println("Po ky emer i todo eshte ketu " + currentList);

        } else {
            System.out.println("ky emer nuk egziston ne todolist ");
        }
        System.out.println();

    }



    public static void lexoToDo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Lexo To-Do");
        System.out.println("----------------------");
        System.out.println("To do lista juaj eshte: " );
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);}
        System.out.println();
     }

    public static void shtypListenToDo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println();



    }

    public static void shtoToDo() {
        System.out.println("Shto to do menu");
        System.out.println("----------------------");
        System.out.print("Shkruani nje todo: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        ToDo todoItem = new ToDo();
        todoItem.setName(item);
        currentList.add(item);
        currentList1.add(todoItem);
        todoItem.print();
        System.out.println();
    }

    public static void fshiToDo() {
        System.out.println("Fshi to do menu");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        shtypListenToDo();
        System.out.print("Todo me cilin numer deshironi ta fshini? : ");
        int index = scanner.nextInt();
        if ((index - 1) < 0 || index > currentList.size()) {
            System.out.println("Keni jepur numer gabim shikoni prap " + currentList.size());
        } else {
            System.out.println("Elementi juaj ne numrin: " + index + " eshte fshire "  );
            currentList.remove(index - 1);

        }
        System.out.println();

    }

    public static void shtypGjithTodo() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To do lista juaj eshte: " );
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);}
        System.out.println();

    }




}
