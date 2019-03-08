package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Class extends Player and is used to model a player in
 * the game of Blackjack
 * @author Nicholas Di Pietrantonio, 2019
 */
public class BlackJackPlayer extends Player {

    //data field
    private ArrayList<BlackJackCard> hand;

    /**
     * Two arg constructor that calls the super class
     * @param name of the player
     * @param hand of the player(what cards do they have)
     */
    public BlackJackPlayer(String name, ArrayList<BlackJackCard> hand) {
        super(name);
        this.hand = hand;
    }

    /**
     * Method to check current players hand
     */
    public void checkHand() {
        System.out.println(getPlayerID() + "'s hand:");
        System.out.println(hand);
    }

    /**
     * Method called to check points of a player
     */
    public void checkPoints() {
        System.out.println(getPlayerID() + "'s points:");
        System.out.println(calculatePoints(hand));
    }

    /**
     * Method is used to draw a card on turn
     * @param card that is added to player hand
     */
    public void addHand(BlackJackCard card) {
        hand.add(card);
        System.out.println("Player " + getPlayerID()
                + " has drawn the card " + card);
        card.showRealValue();
    }

    public ArrayList<BlackJackCard> getHand() {
        return hand;
    }

    /**
     * Method used to calculate points that a player has in hand
     * @param cards the cards that are being checked for sum of pints
     * @return sum of all points in the card hand
     */
    public int calculatePoints(ArrayList<BlackJackCard> cards) {
        int totalPoints = 0;
        for (int i = 0; i < cards.size(); i++) {
            totalPoints = cards.get(i).getRealValue() + totalPoints;
        }
        return totalPoints;
    }

    /**
     * Method used to check if a player is over 21 points (lost)
     * @return boolean dependent on if player is over 21 points or not
     */
    public boolean checkLoss() {
        if (calculatePoints(hand) > 21) {
            System.out.println("Player " + getPlayerID() + " has lost");
            return true;
        }
        return false;
    }

    /**
     * Method gives player options for that turn
     */
    @Override
    public void play() {
        System.out.println("Player " + getPlayerID() + "'s turn");
        System.out.println("1. Hit");
        System.out.println("2. Stay");
        System.out.println("3. Check hand");
        System.out.println("4. End game");
    }

}
