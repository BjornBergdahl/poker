package pokerJava;

import java.util.Scanner;

public class CardGame {

    public static void main (String[] args){
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
        Scanner input = new Scanner(System.in);
        int noPlayers = 0;
        System.out.print("How many players? : ");
        while (noPlayers == 0) {
            if (input.hasNextInt()) {
                noPlayers = input.nextInt();
            } else {
                input.nextLine();
                System.out.print("Please again, with a number. How many players? : ");

            }
        }
        System.out.printf("Players selected: %s",noPlayers);
    }

}
