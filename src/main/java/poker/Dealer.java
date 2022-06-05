package poker;

import poker.algorithm.ShufflingAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dealer class shuffles a {@link Deck} using a specific shuffling algorithm to create a shuffled list of cards.
 *
 * @author PeeGee
 */
public class Dealer {
    private List<Card> shuffledCardList;

    public Dealer() {
        shuffledCardList = new ArrayList<>();
    }

    /**
     * Shuffles a deck of cards
     *
     * @param deck               {@link Deck} object
     * @param shufflingAlgorithm shuffling algorithm
     */
    public void shuffleCards(Deck deck, ShufflingAlgorithm shufflingAlgorithm) {
        List<Card> cardList = shufflingAlgorithm.shuffle(deck);
        setShuffledCardList(cardList);
    }

    /**
     * Draw a list of cards for a player
     *
     * @param handSize handSize of a hand or number of card per each player
     * @return list of {@link Card}
     */
    public Card[] drawHand(int handSize) {
        int j;
        Random pickRandomCard = new Random();
        Card[] hand = new Card[handSize];
        for (int i = 0; i < handSize; i++) {
            j = pickRandomCard.nextInt(shuffledCardList.size());
            hand[i] = shuffledCardList.get(j);
            shuffledCardList.remove(j);
        }
        return hand;
    }

    public List<Card> getShuffledCardList() {
        return shuffledCardList;
    }

    public void setShuffledCardList(List<Card> shuffledCardList) {
        this.shuffledCardList = shuffledCardList;
    }
}
