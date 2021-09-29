package ict.kosovo.growth.basic.ora_3;

import java.util.Scanner;

public class Ushtrimi_1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in); //objekti i cili na mundeson me lexu se cka shkruan shfrytezuesi
        System.out.println("Zgjedhni username: "); //naim_sulejmani
        String username = user.nextLine();
        //e validoni a eshet i nxanun username
        System.out.println("Username i zgjedhur eshte: " + username);
        Test t = new Test(1,"naim");
        Test t2 = t;

    }
}
