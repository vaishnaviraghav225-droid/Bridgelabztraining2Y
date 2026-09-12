package String.Level3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {

        String[] deck = new String[suits.length * ranks.length];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {

        for (int i = 0; i < deck.length; i++) {

            int randomCardNumber =
                    i + (int) (Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {

        String[][] playerCards = new String[players][n];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                playerCards[i][j] = deck[index];
                index++;
            }
        }

        return playerCards;
    }

    public static void printCards(String[][] playerCards) {

        for (int i = 0; i < playerCards.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        int numOfCards = suits.length * ranks.length;

        String[] deck = initializeDeck(suits, ranks);

        System.out.print("Enter number of cards per player: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        if (n * players > numOfCards) {
            System.out.println("Cards cannot be distributed.");
        } else {

            deck = shuffleDeck(deck);

            String[][] playerCards =
                    distributeCards(deck, n, players);

            printCards(playerCards);
        }

        sc.close();
    }
}