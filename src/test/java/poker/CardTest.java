package poker;

import junit.framework.TestCase;
import org.junit.Test;
import poker.constants.CardSuit;
import poker.constants.CardValue;

/**
 * @author PeeGee
 */
public class CardTest extends TestCase {

    @Test
    public void testGetCardSuit() {
        Card card = new Card(CardSuit.CLUBS, CardValue.EIGHT);
        assertEquals(card.getCardSuit(), CardSuit.CLUBS);
    }

    @Test
    public void testGetCardSuitValue() {
        Card card = new Card(CardSuit.DIAMONDS, CardValue.FOUR);
        assertEquals(card.getCardSuit().getSuitValue(), 2);
    }

    @Test
    public void testGetCardValue() {
        Card card = new Card(CardSuit.CLUBS, CardValue.EIGHT);
        assertEquals(card.getCardValue(), CardValue.EIGHT);
    }

    @Test
    public void testGetCardValueRank() {
        Card card = new Card(CardSuit.HEARTS, CardValue.ACE);
        assertEquals(card.getCardValue().getCardRankValue(), 14);
    }
}
