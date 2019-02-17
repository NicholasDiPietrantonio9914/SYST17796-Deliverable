/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author Nicholas Di Pietrantonio, 2019
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<BlackJackCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards() {
        size = 52;
        cards = new ArrayList<>();

        int countCards = 0;
        for (BlackJackCard.Suits s : BlackJackCard.Suits.values()) {
            for (BlackJackCard.Value v : BlackJackCard.Value.values()) {
                cards.add(countCards, new BlackJackCard(s, v));
                countCards++;
            }
        }
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<BlackJackCard> showCards() {
        return cards;
    }

    public BlackJackCard showCard(int get) {
        return cards.get(get);
    }

    public BlackJackCard drawCard(int cardIndex) {
        return cards.get(cardIndex);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

}//end class
