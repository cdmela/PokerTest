package poker;

import junit.framework.TestCase;
import org.junit.Test;
import poker.constants.CardSuit;
import poker.constants.CardValue;
import poker.variant.FiveCardDraw;

/**
 * @author PeeGee
 */
public class FiveCardDrawTest extends TestCase {

    @Test
    public void testIsStraightFlush() {

        Card[] hand = {new Card(CardSuit.SPADES, CardValue.TWO), new Card(CardSuit.SPADES, CardValue.THREE),
                new Card(CardSuit.SPADES, CardValue.FOUR), new Card(CardSuit.SPADES, CardValue.FIVE), new Card(CardSuit.SPADES, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isStraightFlush());
    }

    @Test
    public void testIsFourOfKind() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.ACE), new Card(CardSuit.DIAMONDS, CardValue.ACE),
                new Card(CardSuit.HEARTS, CardValue.ACE), new Card(CardSuit.SPADES, CardValue.ACE), new Card(CardSuit.CLUBS, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isFourOfKind());
    }

    @Test
    public void testIsFullHouse() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.TEN), new Card(CardSuit.DIAMONDS, CardValue.TEN),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.SIX), new Card(CardSuit.CLUBS, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isFullHouse());
    }

    @Test
    public void testIsFlush() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.TEN), new Card(CardSuit.DIAMONDS, CardValue.TEN),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.SIX), new Card(CardSuit.CLUBS, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isFullHouse());
    }

    @Test
    public void testIsStraight() {
        Card[] hand = {new Card(CardSuit.SPADES, CardValue.TWO), new Card(CardSuit.CLUBS, CardValue.THREE),
                new Card(CardSuit.HEARTS, CardValue.FOUR), new Card(CardSuit.DIAMONDS, CardValue.FIVE), new Card(CardSuit.SPADES, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isStraight());
    }

    @Test
    public void testIsThreeOfKind() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.TEN), new Card(CardSuit.DIAMONDS, CardValue.TEN),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.EIGHT), new Card(CardSuit.CLUBS, CardValue.SIX)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isThreeOfKind());
    }

    @Test
    public void testIsTwoPair() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.TEN), new Card(CardSuit.DIAMONDS, CardValue.NINE),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.EIGHT), new Card(CardSuit.CLUBS, CardValue.NINE)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isTwoPair());
    }

    @Test
    public void testIsPair() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.ACE), new Card(CardSuit.DIAMONDS, CardValue.NINE),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.EIGHT), new Card(CardSuit.CLUBS, CardValue.NINE)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isPair());
    }

    @Test
    public void testIsHighCard() {
        Card[] hand = {new Card(CardSuit.CLUBS, CardValue.ACE), new Card(CardSuit.DIAMONDS, CardValue.NINE),
                new Card(CardSuit.HEARTS, CardValue.TEN), new Card(CardSuit.SPADES, CardValue.EIGHT), new Card(CardSuit.CLUBS, CardValue.THREE)};
        FiveCardDraw fiveCardDraw = new FiveCardDraw(hand);
        assertTrue(fiveCardDraw.isHighCard());
    }
}
