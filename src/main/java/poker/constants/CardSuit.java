package poker.constants;

/**
 * Enum contains of list of card suit constants
 *
 * @author PeeGee
 */
public enum CardSuit {

    HEARTS(1),
    DIAMONDS(2),
    CLUBS(3),
    SPADES(4);

    private int suitValue;

    CardSuit(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }
}
