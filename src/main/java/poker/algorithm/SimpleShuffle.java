package poker.algorithm;

import poker.Card;
import poker.Deck;

import java.util.Collections;
import java.util.List;

/**
 * SimpleShuffle class presents a concrete implementation of a shuffling algorithm
 *
 * @author PeeGee
 */
public class SimpleShuffle implements ShufflingAlgorithm {

    @Override
    public List<Card> shuffle(Deck deck) {
        List<Card> cardList = deck.getCardList();
        Collections.shuffle(cardList);

        return cardList;
    }
}
