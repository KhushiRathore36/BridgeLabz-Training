package Strings;
import java.util.*;
public class Cards {

	public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int num = suits.length * ranks.length;
        String[] deck = new String[num];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int cardNumber = i + (int) (Math.random() * (n - i));
            
            String temp = deck[i];
            deck[i] = deck[cardNumber];
            deck[cardNumber] = temp;
        }
    }

    
    public static String[][] distributeDeck(String[] deck, int n, int x) {
        if (n > deck.length) {
            
            return null;
        }

        if (n % x != 0) {
            
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String[] deck = initializeDeck();

       
        shuffleDeck(deck);

       
        int n = sc.nextInt();
        
        int x = sc.nextInt();

        
        String[][] players = distributeDeck(deck, n, x);

        
        printPlayers(players);

       
    }

}
