package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The main class in the Black Jack Card game program used to gather initial
 * requirements to play the game
 * @author Nicholas Di Pietrantonio, 2019
 */
public class Main {
    /**
     * 
     * @param args main method in the program
     */
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        GroupOfCards groupOfCards = new GroupOfCards();
        groupOfCards.shuffle();

        System.out.println("How many players would like to play?(2-4)");
        int playerTotal = input.nextInt();

        while (playerTotal > 4 || playerTotal < 2) {
            System.out.println("Enter a valid player amount.(2-4)");
            playerTotal = input.nextInt();
        }

        ArrayList<BlackJackPlayer> players = new ArrayList();
        String[] playerNames = new String[playerTotal];

        System.out.println("Enter player names");
        for (int i = 0; i < playerTotal; i++) {
            ArrayList<BlackJackCard> hand = new ArrayList();
            System.out.println("Enter name for player " + (i + 1));
            playerNames[i] = input.next();
            players.add(new BlackJackPlayer(playerNames[i], hand));
        }

        BlackJackGame play = new BlackJackGame(players, groupOfCards);
        play.play();
    }

}
