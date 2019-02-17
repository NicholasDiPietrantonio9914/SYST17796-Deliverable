package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Nicholas Di Pietrantonio, 2019
 */
public class BlackJackPlayer extends Player {

    private ArrayList<BlackJackCard> hand;

    public BlackJackPlayer(String name, ArrayList<BlackJackCard> hand) {
        super(name);
        this.hand = hand;
    }

    public void checkHand() {
        System.out.println(getPlayerID() + "'s hand:");
        System.out.println(hand);
    }

    public void checkPoints() {
        System.out.println(getPlayerID() + "'s points:");
        System.out.println(calculatePoints(hand));
    }

    public void addHand(BlackJackCard card) {
        hand.add(card);
        System.out.println("Player " + getPlayerID()
                + " has drawn the card " + card);
        card.showRealValue();
    }

    public ArrayList<BlackJackCard> getHand() {
        return hand;
    }

    public int calculatePoints(ArrayList<BlackJackCard> cards) {
        int totalPoints = 0;
        for (int i = 0; i < cards.size(); i++) {
            totalPoints = cards.get(i).getRealValue() + totalPoints;
        }
        return totalPoints;
    }

    public boolean checkLoss() {
        if (calculatePoints(hand) > 21) {
            System.out.println("Player " + getPlayerID() + " has lost");
            return true;
        }
        return false;
    }

    @Override
    public void play() {
        System.out.println("Player " + getPlayerID() + "'s turn");
        System.out.println("1. Hit");
        System.out.println("2. Stay");
        System.out.println("3. Check hand");
        System.out.println("4. End game");
    }

}
