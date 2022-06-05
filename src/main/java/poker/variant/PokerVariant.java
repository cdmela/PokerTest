package poker.variant;

import poker.Card;

/**
 * @author PeeGee
 */
public abstract class PokerVariant {
    private Card[] hand;

    public PokerVariant(Card[] hand) {
        this.hand = hand;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public abstract boolean isStraightFlush();

    public abstract boolean isFourOfKind();

    public abstract boolean isFullHouse();

    public abstract boolean isFlush();

    public abstract boolean isStraight();

    public abstract boolean isThreeOfKind();

    public abstract boolean isTwoPair();

    public abstract boolean isPair();

    public abstract boolean isHighCard();
}
