package poker;

/**
 * Player class represents a Poker player
 *
 * @author PeeGee
 */
public class Player {

    private Card[] hand;


    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }


    public String createCardsNames() {

        String cardNames = "";
        for (Card card : getHand()) {
            cardNames = cardNames + translateCardName(card);
        }
        return cardNames;
    }

    /**
     * Translates a card name provided
     *
     * @param card {@link Card} object
     * @return translated card name
     */
    private String translateCardName(Card card) {
        String str = null;

        if (card.getCardValue().getCardRankValue() == 2) {
            str = "2";
        } else if (card.getCardValue().getCardRankValue() == 3) {
            str = "3";
        } else if (card.getCardValue().getCardRankValue() == 4) {
            str = "4";
        } else if (card.getCardValue().getCardRankValue() == 5) {
            str = "5";
        } else if (card.getCardValue().getCardRankValue() == 6) {
            str = "6";
        } else if (card.getCardValue().getCardRankValue() == 7) {
            str = "7";
        } else if (card.getCardValue().getCardRankValue() == 8) {
            str = "8";
        } else if (card.getCardValue().getCardRankValue() == 9) {
            str = "9";
        } else if (card.getCardValue().getCardRankValue() == 10) {
            str = "10";
        } else if (card.getCardValue().getCardRankValue() == 11) {
            str = "J";
        } else if (card.getCardValue().getCardRankValue() == 12) {
            str = "Q";
        } else if (card.getCardValue().getCardRankValue() == 13) {
            str = "K";
        } else if (card.getCardValue().getCardRankValue() == 14) {
            str = "A";
        }

        if (card.getCardSuit().getSuitValue() == 1) {
            str = str + "♥ ";
        } else if (card.getCardSuit().getSuitValue() == 2) {
            str = str + "♦ ";
        } else if (card.getCardSuit().getSuitValue() == 3) {
            str = str + "♣ ";
        } else if (card.getCardSuit().getSuitValue() == 4) {
            str = str + "♠ ";
        }

        return str;
    }
}
