package poker;

import junit.framework.TestCase;
import org.junit.Test;
import poker.algorithm.ShufflingAlgorithm;
import poker.algorithm.SimpleShuffle;

import java.util.List;

/**
 * @author PeeGee
 */
public class DealerTest extends TestCase {

    @Test
    public void testShuffleCards() {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        deck.populateCardList();
        List<Card> cardList = deck.getCardList();
        ShufflingAlgorithm algorithm = new SimpleShuffle();
        dealer.shuffleCards(deck, algorithm);

        List<Card> shuffledCardList = dealer.getShuffledCardList();
        boolean isShuffled = false;
        for (int i = 0; i < cardList.size(); i++) {
            //Deck card list and shuffle card list should be the same
            if (cardList.get(i).getCardValue() == shuffledCardList.get(i).getCardValue()) {
                isShuffled = true;
            }
            assertTrue(isShuffled);
            isShuffled = false;
        }
    }

    @Test
    public void testDrawHand() {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        deck.populateCardList();
        dealer.setShuffledCardList(deck.getCardList());
        Card[] cards = dealer.drawHand(5);
        assertEquals(cards.length, 5);
    }
}
