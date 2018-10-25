package trivera.core.collections.cards;

import jdk.nashorn.internal.runtime.JSType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

    private List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>(52);

        for (Suit suit: Suit.values()) {
            for (Rank rank : Rank.values()) {
                this.deck.add(new Card(suit, rank));
            }
        }

      shuffle();

    }

    /**
     * Returns the Card at the specified position in the deck.
     *
     * This method is used to perform sorting and shuffling.
     *
     * @param index
     *            Index of the card to return.
     *
     * @return The card at the specified position in the deck.
     *
     * @throws IndexOutOfBoundsException
     *             If the given index is out of range (<tt>index &lt; 0 || index &gt;= size()</tt>).
     */


    /**
     * Returns the supplied number of cards from the top of the deck.
     *
     * This method returns (and removes) the first N cards
     * from the top of the deck. The new list is sorted using the custom
     * comparator that sorts according to number, not suit.
     *
     * @return java.util.List The list of cards in the hand
     * @param count
     *            The number of cards to take from the top of the deck
     */
  public List<Card> dealCards(int count) {

        // Create the sub-list of N cards
        List<Card> cardHand = new ArrayList<>(count);

  // Deal each card into the hand
  for (int i=0; i<count; i++) {
	Card topCard = (Card)deck.remove(0);
	cardHand.add(topCard);
  }

        // Sort the sub-list, using our custom comparator
        Collections.sort(cardHand, new HandComparator());

        // Return the sorted sub-list
        return cardHand;
    }

    /**
     * Replaces the card at the specified position in the deck with the
     * specified card.
     * <p>
     *
     * This method is used for sorting and shuffling.
     *
     * @param index
     *            Index of card to replace.
     * @param element
     *            Card to be stored at the specified position.
     * @return The card previously at the specified position.
     *
     * @throws IllegalArgumentException
     *             If the object is not a Card
     *
     * @throws IndexOutOfBoundsException
     *             If the specified index is out of range (<tt>index &lt; 0 || index &gt;= size()</tt>).
     */


    /**
     * Returns the list of cards in the deck, sorted by suit.
     *
     * This method makes a copy of the deck, and sorts the copy using the
     * natural object ordering of the cards.
     *
     * An unmodifiable copy of the sorted copy is returned to the caller. Since
     * we've already made a copy of the real deck, we don't really have to make
     * yet a second copy that is unmodifiable, but we do so anyway just because
     * it's there!
     *
     * @return java.util.List An unmodifiable list of sorted cards
     */

  public List<Card> showDeck() {

        // Create a copy of the deck of cards
        List<Card> cardList = new ArrayList<Card>(deck);

        // Sort the copy using the natural object ordering of the cards
        Collections.sort(cardList);

        // Create an unmodifiable copy of the sorted copy, and return it
        return Collections.unmodifiableList(cardList);
    }

    /**
     * Shuffles the deck of cards.
     *
     * Before each hand is dealt, the cards are shuffled. Since we are dealing
     * from the true deck, it is the true deck contained as an instance field of
     * this class that must be shuffled.
     */
    public void shuffle() {

        // Shuffle this.deck

        Collections.shuffle(deck);

    }

    /**
     * Returns the number of cards in the deck.
     *
     * Should always return back 52.
     *
     * @return The number of cards in the deck
     */

}
