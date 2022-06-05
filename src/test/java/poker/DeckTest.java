package poker;

import junit.framework.TestCase;

/**
 * @author PeeGee
 */
public class DeckTest extends TestCase {

    public void testPopulateCardList() {
        Deck deck = new Deck();
        deck.populateCardList();

        assertFalse(deck.getCardList().isEmpty());
    }
}
