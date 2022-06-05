package poker;

import poker.algorithm.ShufflingAlgorithm;
import poker.algorithm.SimpleShuffle;
import poker.variant.FiveCardDraw;
import poker.variant.PokerVariant;

/**
 * FiveCardDrawerTester is the tester class or point of entry for the program
 *
 * @author PeeGee
 */
public class FiveCardDrawerTester {

    public static void main(String args[]) {

        int drawSize = 5;
        Deck deck = new Deck();
        deck.populateCardList();
        int numberOfShuffles = 3;
        int count = 1;

        Dealer dealer = new Dealer();
        ShufflingAlgorithm shufflingAlg = new SimpleShuffle();
        while (count <= numberOfShuffles) {
            System.out.print("Shuffling… ");
            dealer.shuffleCards(deck, shufflingAlg);
            deck.setCardList(dealer.getShuffledCardList());

            count++;
        }
        System.out.println();
        Card[] hand = dealer.drawHand(drawSize);

        Player player = new Player();
        player.setHand(hand);
        System.out.println("Your hand: " + player.createCardsNames());

        PokerVariant fiveCardDraw = new FiveCardDraw(hand);
        determineHandRank(fiveCardDraw);
    }

    private static void determineHandRank(PokerVariant fiveCardDraw) {
        System.out.print("You have: ");
        if (fiveCardDraw.isStraightFlush()) {
            System.out.println("Straight Flush");
        } else if (fiveCardDraw.isFourOfKind()) {
            System.out.println("Four of a Kind");
        } else if (fiveCardDraw.isFullHouse()) {
            System.out.println("Full House");
        } else if (fiveCardDraw.isFlush()) {
            System.out.println("Flush");
        } else if (fiveCardDraw.isStraight()) {
            System.out.println("Straight");
        } else if (fiveCardDraw.isThreeOfKind()) {
            System.out.println("Three of a Kind");
        } else if (fiveCardDraw.isTwoPair()) {
            System.out.println("Two Pair");
        } else if (fiveCardDraw.isPair()) {
            System.out.println("One Pair");
        } else if (fiveCardDraw.isHighCard()) {
            System.out.println("High Cards");
        }
    }
}
