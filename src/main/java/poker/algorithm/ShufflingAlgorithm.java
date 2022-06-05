package poker.algorithm;

import poker.Card;
import poker.Deck;

import java.util.List;

/**
 * @author PeeGee
 */
public interface ShufflingAlgorithm {

    public List<Card> shuffle(Deck deck);
}
