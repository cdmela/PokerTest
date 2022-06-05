package poker;

import poker.constants.CardSuit;
import poker.constants.CardValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Deck class represents a list of {@link Card}
 *
 * @author PeeGee
 */
public class Deck {

    private List<Card> cardList;

    public Deck() {
        cardList = new ArrayList<>();
    }

    public void populateCardList() {
        cardList.clear();
        for (CardSuit cardSuit : CardSuit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                Card card = new Card(cardSuit, cardValue);
                cardList.add(card);
            }
        }
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
