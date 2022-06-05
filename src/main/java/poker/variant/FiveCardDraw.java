package poker.variant;

import poker.Card;

/**
 * FiveCardDraw represents a main.poker variant
 * Hand ranks methods implementation were obtained and modified to return booleans instead of integers from the below link
 * https://gist.github.com/stedmanm/32db2e8eaa44acabc539
 *
 * @author PeeGee
 */
public class FiveCardDraw extends PokerVariant {

    public FiveCardDraw(Card[] hand) {
        super(hand);
    }

    /**
     * Checks for Straight flush ranking
     *
     * @return true, if the cards are in sequence and are from the same suit
     */
    @Override
    public boolean isStraightFlush() {

        Card[] cardList = getHand();
        boolean flag = false;
        if ((cardList[0].getCardSuit() == cardList[1].getCardSuit()) && (cardList[0].getCardSuit() == cardList[2].getCardSuit()) &&
                (cardList[0].getCardSuit() == cardList[3].getCardSuit()) && (cardList[0].getCardSuit() == cardList[4].getCardSuit())) {
            flag = true;
        }
        if (flag == true) {
            if (cardList[0].getCardValue().getCardRankValue() == 2 && cardList[1].getCardValue().getCardRankValue() == 3 && cardList[2].getCardValue().getCardRankValue() == 4 && cardList[3].getCardValue().getCardRankValue() == 5 && cardList[4].getCardValue().getCardRankValue() == 14) {
                return true;
            }
            for (int i = 0; i < 4; i++) {
                if ((cardList[i].getCardValue().getCardRankValue() + 1) != (cardList[i + 1].getCardValue().getCardRankValue())) {
                    return false;
                }
            }
            int totalValue = 104 + cardList[4].getCardValue().getCardRankValue();
            return totalValue >= 109 && totalValue <= 118;
        }
        return false;
    }

    /**
     * Checks for Four of a kind ranking
     *
     * @return true, if the hand contains four cards of the same value
     */
    @Override
    public boolean isFourOfKind() {

        Card[] cardList = getHand();
        int j, count = 0;
        for (int i = 0; i < 4; i++) {
            if (count == 3) {
                int totalValue = cardList[i - 1].getCardValue().getCardRankValue() + 91;
                return totalValue >= 93 && totalValue <= 105;
            }
            count = 0;
            for (j = i + 1; j < 5; j++) {
                if (cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) {
                    count++;
                }
            }
        }

        return false;
    }

    /**
     * Checks for Full house ranking
     *
     * @return true if the hand contains Three of a kind and a Pair
     */
    @Override
    public boolean isFullHouse() {

        Card[] cardList = getHand();
        int j, count = 0, temp = 0;
        for (int i = 0; i < 4; i++) {
            if (count == 2) {
                temp = cardList[i - 1].getCardValue().getCardRankValue();
            }
            count = 0;
            for (j = i + 1; j < 5; j++) {
                if (cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) {
                    count++;
                }
            }
        }
        if (temp != 0) {
            for (int i = 0; i < 4; i++) {
                for (j = i + 1; j < 5; j++) {
                    if ((cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) && (cardList[i].getCardValue().getCardRankValue() != temp)) {
                        int totalValue = 78 + temp;
                        return totalValue >= 80 && totalValue <= 92;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public boolean isFlush() {

        Card[] cardList = getHand();
        if ((cardList[0].getCardSuit() == cardList[1].getCardSuit()) && (cardList[0].getCardSuit() == cardList[2].getCardSuit()) &&
                (cardList[0].getCardSuit() == cardList[3].getCardSuit()) && (cardList[0].getCardSuit() == cardList[4].getCardSuit())) {
            int totslValue = 65 + cardList[4].getCardValue().getCardRankValue();
            return totslValue >= 67 && totslValue <= 79;
        }
        return false;
    }

    @Override
    public boolean isStraight() {

        Card[] cardList = getHand();
        if (cardList[0].getCardValue().getCardRankValue() == 2 && cardList[1].getCardValue().getCardRankValue() == 3 &&
                cardList[2].getCardValue().getCardRankValue() == 4 && cardList[3].getCardValue().getCardRankValue() == 5 && cardList[4].getCardValue().getCardRankValue() == 14) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if ((cardList[i].getCardValue().getCardRankValue() + 1) != (cardList[i + 1].getCardValue().getCardRankValue())) {
                return false;
            }
        }
        int totalValue = 52 + cardList[4].getCardValue().getCardRankValue();
        return totalValue >= 54 && totalValue <= 66;
    }

    @Override
    public boolean isThreeOfKind() {

        Card[] cardList = getHand();
        int j, count = 0;
        for (int i = 0; i < 4; i++) {
            if (count == 2) {
                int totalValue = cardList[i - 1].getCardValue().getCardRankValue() + 39;
                return totalValue >= 41 && totalValue <= 53;
            }
            count = 0;
            for (j = i + 1; j < 5; j++) {
                if (cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) {
                    count++;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isTwoPair() {

        Card[] cardList = getHand();
        int j, flag = 0, count = 0;
        for (int i = 0; i < 4; i++) {
            for (j = i + 1; j < 5; j++) {
                if ((cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) && (cardList[i].getCardValue().getCardRankValue() != flag)) {
                    count++;
                    if (cardList[i].getCardValue().getCardRankValue() > flag) {
                        flag = cardList[i].getCardValue().getCardRankValue();
                    }
                }
            }
        }
        if (count == 2) {
            int totalValue = flag + 26;
            return totalValue >= 28 && totalValue <= 40;
        } else {
            return false;
        }

    }

    @Override
    public boolean isPair() {

        Card[] cardList = getHand();
        int j, flag = 0;
        for (int i = 0; i < 4; i++) {
            for (j = i + 1; j < 5; j++) {
                if ((cardList[i].getCardValue().getCardRankValue() == cardList[j].getCardValue().getCardRankValue()) && (cardList[i].getCardValue().getCardRankValue() > flag)) {
                    flag = cardList[i].getCardValue().getCardRankValue();
                }
            }
        }
        if (flag == 0) {
            return false;
        } else {
            int totalValue = flag + 13;
            return totalValue >= 15 && totalValue <= 27;
        }
    }

    /**
     * Checks for High card ranking
     *
     * @return true, if the other hand rankings are not met and a card with highest value is used. Ace is the highest in ranking
     */
    @Override
    public boolean isHighCard() {

        Card[] cardList = getHand();
        int highValue = cardList[4].getCardValue().getCardRankValue();
        return highValue >= 2 && highValue <= 14;
    }

}
