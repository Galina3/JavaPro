package homeWork07_06;

import java.util.Arrays;
import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        final int cardsForPlayer = 5;
        final Scanner sc = new Scanner(System.in);
        int players;
        final int numberOfCards = Suits.values().length * Ranks.values().length;

        String[] deck = new String[numberOfCards];



        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Too many players!");
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
                break;
            }
        }



        Deck.deckInitialization(deck);
        //System.out.println(Arrays.toString(deck));
        Deck.deckShuffling(deck, numberOfCards);
        //Deck.showShuffledDeck(deck, cardsForPlayer, players);

        sc.close();
    }
}


