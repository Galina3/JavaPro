package homeWork07_06;

import java.util.Random;

public class Deck {
    public static void deckInitialization(String[] deck) {
        for (int i = 0; i < Ranks.values().length; i++) {
            for (int j = 0; j < Suits.values().length; j++) {
                deck[Suits.values().length * i + j] = Ranks.values()[i] + " " + Suits.values()[j];
            }
        }
    }

    public static void deckShuffling(String[] deck, int numberOfCards) {
        final Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i));
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }

    public static void showShuffledDeck(String[] deck, int cardsForPlayer, int players) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}