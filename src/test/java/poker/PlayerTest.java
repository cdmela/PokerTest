package poker;

import junit.framework.TestCase;
import org.junit.Test;
import poker.constants.CardSuit;
import poker.constants.CardValue;

/**
 * @author PeeGee
 */
public class PlayerTest extends TestCase {

    @Test
    public void testCreateCardsNames() {

        Player player = new Player();
        Card[] hand = {new Card(CardSuit.DIAMONDS, CardValue.EIGHT), new Card(CardSuit.HEARTS, CardValue.FOUR),
                new Card(CardSuit.CLUBS, CardValue.FOUR), new Card(CardSuit.SPADES, CardValue.ACE), new Card(CardSuit.DIAMONDS, CardValue.TEN)};
        player.setHand(hand);

        String cardNames = player.createCardsNames();

        assertTrue(cardNames.contains("8♦"));
        assertTrue(cardNames.contains("A♠"));
        assertTrue(cardNames.contains("10♦"));
        assertTrue(cardNames.contains("4♥"));
        assertTrue(cardNames.contains("4♣"));

    }
}
