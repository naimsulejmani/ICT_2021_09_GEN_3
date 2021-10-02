package ict.kosovo.growth.basic.ora_6;

public class Letrat1 {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] fullDeck = new String[ranks.length * suits.length];//52

        //lumbardh gashi
        System.out.println("Lumbardh Gashi Detyra");
        System.out.println("---------------------------------");
        System.out.println("Gjithsej 52 letra :");
        for (int j =0 ;j< suits.length;j++){
            System.out.printf("Sortimi i letrave per simbolin => %s : ",suits[j]);
            for (int i = 0; i < ranks.length; i++){

                System.out.print(ranks[i]+suits[j]);
            }
        }

        System.out.println();
        for (int i = 0 ; i< ranks.length;i++) {
            System.out.printf(" 4 Letrat per letren %s : %n", ranks[i]);
            for (int j = 0; j < suits.length; j++) {
                System.out.println(ranks[i] + suits[j]);
            }
        }

        //fitore tahiri
        System.out.println("Lumbardh Fitore Tahiri");
        System.out.println("---------------------------------");
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                System.out.println(fullDeck[i]=ranks[j]+suits[i]);
            }
        }
        System.out.println("============================================");
        for(int i=0;i<ranks.length;i++){
            for(int j=0;j<suits.length;j++){
                System.out.println(fullDeck[i]=ranks[i]+suits[j]);
            }
        }
    }

}

