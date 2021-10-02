package ict.kosovo.growth.basic.ora_6;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numrat = {10, 87, 44, 12, 98, 46, 87, 1, 9, 65};

        int total = 0;

        for (int i = 0; i < numrat.length; i++) {
            total += numrat[i];
        }
        System.out.println(total);
        total = 0;
        //kjo perdoret kurkemi nevoje cdohere me iteru prej fillimit deri ne fund
        for (int numri : numrat) {
            total += numri;
        }
        System.out.println(total);

    }
}
