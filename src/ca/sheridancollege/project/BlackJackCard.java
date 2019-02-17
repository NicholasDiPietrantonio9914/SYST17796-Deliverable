package ca.sheridancollege.project;

/**
 *
 * @author Nicholas Di Pietrantonio, 2019
 */
public class BlackJackCard extends Card {

    public enum Suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, JACK, QUEEN, KING
    };
    private final Suits suits;
    private final Value value;
    private int realValue;

    public BlackJackCard(Suits suits, Value value) {
        this.suits = suits;
        this.value = value;
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

    public void showRealValue() {
        switch (value) {
            case ACE:
                java.util.Scanner input = new java.util.Scanner(System.in);
                System.out.println("would you like this Ace to be worth 1 or 11?");
                while (true) {
                    int choice = input.nextInt();
                    if (choice == 11) {
                        realValue = 11;
                        break;
                    } else if (choice == 1) {
                        realValue = 1;
                        break;
                    }
                    System.out.println("Input valid answer");
                }
                break;
            case KING:
                realValue = 10;
                break;
            case QUEEN:
                realValue = 10;
                break;
            case JACK:
                realValue = 10;
                break;
            case TWO:
                realValue = 2;
                break;
            case THREE:
                realValue = 3;
                break;
            case FOUR:
                realValue = 4;
                break;
            case FIVE:
                realValue = 5;
                break;
            case SIX:
                realValue = 6;
                break;
            case SEVEN:
                realValue = 7;
                break;
            case EIGHT:
                realValue = 8;
                break;
            case NINE:
                realValue = 9;
                break;
            case TEN:
                realValue = 10;
                break;
        }
    }

    @Override
    public String toString() {
        return value + " of " + suits;
    }

}
