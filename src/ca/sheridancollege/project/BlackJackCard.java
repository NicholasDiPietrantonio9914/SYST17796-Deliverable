package ca.sheridancollege.project;

/**
 * Class is sued to represent a standard card with a suit and value
 * @author Nicholas Di Pietrantonio, 2019
 */
public class BlackJackCard extends Card {

    // enums to represent different values of cards
    public enum Suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING
    };

    
    //data fields
    private final Suits suits;
    private final Value value;
    private int realValue;

    /**
     * two arg constructor that is used to model a standard card
     * @param suits Hearts, Spades, Clubs etc
     * @param value Ace King Ten Queen etc
     */
    public BlackJackCard(Suits suits, Value value) {
        this.suits = suits;
        this.value = value;
    }
    
    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }
    
    public Value getValue() {
        return value;
    }

    public Suits getSuits() {
        return suits;
    }

    public int getRealValue() {
        return realValue;
    }

    /**
     * method is used to determine the value in points of a card (King = 10 etc)
     */
    public void showRealValue() {
        switch (value) {
            case ACE:
                java.util.Scanner input = new java.util.Scanner(System.in);
                System.out.println("would you like this Ace to be worth 1 or 11?");
                while (true) {
                    int choice = input.nextInt();
                    if (choice == 11) {
                        setRealValue(11);
                        break;
                    } else if (choice == 1) {
                        setRealValue(1);
                        break;
                    }
                    System.out.println("Input valid answer");
                }
                break;
            case KING:
                setRealValue(10);
                break;
            case QUEEN:
                setRealValue(10);
                break;
            case JACK:
                setRealValue(10);
                break;
            case TWO:
                setRealValue(2);
                break;
            case THREE:
                setRealValue(3);
                break;
            case FOUR:
                setRealValue(4);
                break;
            case FIVE:
                setRealValue(5);
                break;
            case SIX:
                setRealValue(6);
                break;
            case SEVEN:
                setRealValue(7);
                break;
            case EIGHT:
                setRealValue(8);
                break;
            case NINE:
                setRealValue(9);
                break;
            case TEN:
                setRealValue(10);
                break;
        }
    }

    /**
     * overriden toString method to return the card values
     * @return card value(king) and suit(hearts)
     */
    @Override
    public String toString() {
        return value + " of " + suits;
    }

}
