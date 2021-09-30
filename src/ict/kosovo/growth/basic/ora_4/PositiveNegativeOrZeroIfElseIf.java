package ict.kosovo.growth.basic.ora_4;

import java.util.Scanner;

public class PositiveNegativeOrZeroIfElseIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer dhe pastaj une ja qelloj se cfare eshte:");
        int numri = reader.nextInt();

        if (numri > 0) {
            System.out.println("Numri eshte pozitive");
        } else if (numri < 0)
            System.out.println("Numri eshte negtative");
        else
            System.out.println("Numri eshte 0.");

        System.out.println("Ky kode do te ekzetuhet vetem ne else - dhe kjo nuk eshte e sakt");
    }
}
