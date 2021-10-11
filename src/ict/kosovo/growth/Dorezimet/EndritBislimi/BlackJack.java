package ict.kosovo.growth.Dorezimet.EndritBislimi;

import java.util.Scanner;
import java.util.Vector;

public class BlackJack {
    public static class BlackjackConsole
    {

        private static Scanner reader = new Scanner(System.in);
        private int[] deck;
        private int currentPosition;
        private Vector dora;

        public static void main(String[] args)
        {
            new BlackjackConsole().run();
        }
        public void run()
        {
            System.out.println();
            System.out.print("Ju lutem shkruani emrin tuaj: ");
            String emri = reader.nextLine();
            System.out.println("-------------------------------------------");
            System.out.println("WELCOME TO HARAM CASINO Mr. "+emri);//Haram se shkon me pare del pa pare
            System.out.println("-------------------------------------------");
            System.out.println();
            System.out.print("Sa para keni: ");
            int parat = reader.nextInt();
            int basti;
            boolean lojtariFiton;

            System.out.println();
            while (true)
            {
                System.out.print("Ju keni " + parat + " EURO. ");
                do
                {
                    System.out.print("Sa euro deshironi të vini bast (0 euro nese deshironi te dili nga loja): ");
                    basti = reader.nextInt();
                    if (basti < 0 || basti > parat)
                    {
                        System.out.print("Zoteri ne nuk japim para hua, ju lutem thuani nje shifer midis 1 dhe " + parat + ". ");
                    }
                } while (basti < 0 || basti > parat);
                if (basti == 0)
                {
                    break;
                }
                lojtariFiton = playBlackjack();
                if (lojtariFiton)
                {
                    parat = parat + basti;
                } else
                {
                    parat = parat - basti;
                }
                System.out.println();
                if (parat == 0)
                {
                    System.out.println("Ju nuk keni para ");
                    break;
                }
            }

            System.out.println();
            System.out.println("ju largoheni me " + parat + " EUR0");

        }

        private boolean playBlackjack() {

            Vector kundershtari;
            Vector lojtari;


            deck = new int[52];
            int cardCt = 0;
            for (int suit = 0; suit <= 3; suit++) {
                for (int value = 1; value <= 13; value++) {
                    deck[cardCt] = value;
                    cardCt++;
                }
            }
            currentPosition = 0;
            //vector is dynamic array list
            kundershtari = new Vector();
            lojtari = new Vector();

            shuffle();

            kundershtari.addElement(dealCard());
            kundershtari.addElement(dealCard());
            lojtari.addElement(dealCard());
            lojtari.addElement(dealCard());

            //nese pas dores se pare se ndarjes se kartave, vlera e tyre eshte 21, kemi direkt BLACKJACK

            if (value(kundershtari) == 21) {
                System.out.println();
                System.out.print("Kundershtari ka " + showCard(getCard(kundershtari, 0)) + ", " + showCard(getCard(kundershtari, 1)) + ". ");
                System.out.print("Ju keni ka " + showCard(getCard(lojtari, 0)) + ", " + showCard(getCard(lojtari, 1)) + ". ");
                System.out.println("Kundershtari ka Blackjack. Kundershtari ka fituar ");
                System.out.println();
                return false;
            }

            if (value(lojtari) == 21) {
                //LOJTARI ne kete rast jeni ju, dmth TPP
                System.out.println();
                System.out.print("Kundershtari ka " + showCard(getCard(kundershtari, 0)) + ", " + showCard(getCard(kundershtari, 1)) + ". ");
                System.out.print("Ju keni " + showCard(getCard(lojtari, 0)) + ", " + showCard(getCard(lojtari, 1)) + ".");
                System.out.println();
                System.out.print("Ju keni Blackjack. Ju keni fituar.");
                return true;
            }
            while (true)
            {
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("Letrat e juaja jane: ");
                for (int i = 0; i < lojtari.size(); i++) {
                    System.out.println( showCard(getCard(lojtari, i)));
                }
                System.out.println("Totali i juaj eshte " + value(lojtari));
                System.out.println("----------------------------------");
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("Kundershtari eshte duke treguar " + showCard(getCard(kundershtari, 0)));
                System.out.println("----------------------------------");
                System.out.println();
                System.out.print("HIT (H) apo STAY (S): ");
                char userAction;
                do {
                    userAction = Character.toUpperCase(reader.next().charAt(0));
                    if (userAction != 'H' && userAction != 'S') {
                        System.out.print("Ju lutem pergjigjuni me H ose S:  ");
                    }
                } while (userAction != 'H' && userAction != 'S');


                if (userAction == 'S') {
                    //nese zgjedhni stay ateher do ta mbani vleren paraprake te letrave
                    System.out.println("Ju keni zgjedhur STAY");
                    break;
                }
                else {
                    int newCard = dealCard();
                    lojtari.addElement(newCard);
                    System.out.println(); //nese zgjedhni HIT ateher nje vlere random do te ju shtohet letrave tuaja
                    System.out.println("-------------------------------");
                    System.out.println("Ju keni zgjedhur HIT ");
                    System.out.println("Letra juaj eshte " + showCard(newCard));
                    System.out.println("Totali juaj eshte " + value(lojtari));
                    System.out.println("-------------------------------");
                    System.out.println();
                    if (value(lojtari) > 21) {
                        System.out.println();
                        System.out.println("----------------------------------------------");
                        System.out.println("Vlera e letrave tuaja kalon 21. Ju keni humbur. ");
                        //System.out.println("Letra tjeter e kundershtarit ishte " + showCard(getCard(kundershtari, 1)));
                        System.out.println("----------------------------------------------");
                        return false;
                    }
                }

            }

            System.out.println();
            System.out.println("-------------------------------"); //kundershtari zgjedh stay, dmth nuk i shtohet vlere ne kartat e tij
            System.out.println("Kundershtari zgjedh STAY ");
            System.out.println("Letrat e kundershtarit jane ");
            System.out.println(showCard(getCard(kundershtari, 0)));
            System.out.println(showCard(getCard(kundershtari, 1)));
            System.out.println("-------------------------------");
            System.out.println();
            while (value(kundershtari) <= 16) {
                int newCard = dealCard();
                System.out.println("Kundershtari zgjedh HIT dhe merr " + showCard(newCard)+". ");
                kundershtari.addElement(newCard);
            }
            System.out.println("Totali i kundershtarit eshte " + value(kundershtari));
            System.out.println();

            if (value(kundershtari) > 21) {
                System.out.print("Vlera e letrave te kundershtarit tjeter kalon mbi 21. Ju keni fituar! ");
                return true;

            }
            else {
                if (value(kundershtari) == value(lojtari)) {
                    System.out.println("Kundershtari morri barazim. Ju keni humbur ");
                    return false;
                }
                else {
                    if (value(kundershtari) > value(lojtari)) {
                        System.out.println("Kundershtari fiton sepse ka " + value(kundershtari) + " pike, ndersa piket tua jane " + value(lojtari) + ".");
                        return false;
                    }
                    else {
                        System.out.println("Ju fitoni sepse ju keni " + value(lojtari) + " pike, ndersa piket e kundershtarit jane " + value(kundershtari) + ".");
                        return true;
                    }
                }
            }

        }

        public int dealCard() {

            if (currentPosition == 52) {
                shuffle();
            }
            currentPosition++;
            return deck[currentPosition - 1];
        }

        public void shuffle() {

            for (int i = 51; i > 0; i--) {
                int rand = (int) (Math.random() * (i + 1));
                int temp = deck[i];
                deck[i] = deck[rand];
                deck[rand] = temp;
            }
            currentPosition = 0;
        }

        public int getCard(Vector hand, int position) {

            if (position >= 0 && position < hand.size()) {
                return ((Integer)hand.elementAt(position)).intValue();
            }
            else {
                return 0;
            }
        }

        public int value(Vector hand) {
            int vlera;
            boolean ace;

            int cards;

            vlera = 0;
            ace = false;
            cards = hand.size();

            for (int i = 0; i < cards; i++) {

                int card;
                int vleraKartave;
                card = getCard(hand, i);
                vleraKartave = getCardValue(card);
                if (vleraKartave > 10) {
                    vleraKartave = 10;
                }
                if (vleraKartave == 1)
                {
                    ace = true;
                }
                vlera = vlera + vleraKartave;
            }
            if (ace == true && vlera + 10 <= 21)
            {
                vlera = vlera + 10;
            }

            return vlera;

        }

        public String showCard(int card) {
            switch (card) {
                case 1:
                    return "ACE";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "JACK";
                case 12:
                    return "QUEEN";
                case 13:
                    return "KING";
                default:
                    return "?";
            }
        }
        public int getCardValue(int card)
        {
            int rezultati = card;
            switch (card)
            {
                case 11:
                case 12:
                case 13:
                    rezultati =  10;
            }
            return rezultati;
        }
    }
}