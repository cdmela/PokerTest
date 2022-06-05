package poker.constants;

/**
 * Enum contains of list of card value constants e.g 2, 3 and Jack, Queen, King and Ace represented by 11, 12, 13 and 14 respectively
 *
 * @author PeeGee
 */
public enum CardValue {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int cardRankValue;

    CardValue(int cardRankValue) {
        this.cardRankValue = cardRankValue;
    }

    public int getCardRankValue() {
        return cardRankValue;
    }
}
