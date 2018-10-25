package trivera.core.collections.cards;


/**
 * This class represents a card from a standard card deck.
 * <p>
 * When the deck is constructed it will fill itself with the 52 cards in a
 * standard deck (no jokers!).
 * <p>
 * While there are constants defined to represent the different suits and
 * values, they would probably never be used outside of the code that is already
 * written here.
 * <p>
 * A card has a natural sort order of suit followed by number. This works well
 * for displaying all the cards in a deck, where all the hearts are shown,
 * followed by all diamonds, etc. This is not the ideal way to show cards in a
 * hand, where cards are usually grouped by their number (2 of a kind, etc.).
 */
public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Compares this card with the specified card for order.
     * <p>
     * A card is determined to be less than another card by comparing its suit
     * and its number. The priority is to first compare the suits. Only if the
     * suits are equal are the numbers then compared. This makes for good deck
     * sorting, but inappropriate hand sorting.
     *
     * @param o the Card to be compared.
     * @return a negative integer, zero, or a positive integer as this Card is
     * less than, equal to, or greater than the specified Card.
     * @throws ClassCastException if the specified object's type is not Card
     */

    public int compareTo(Card o) {


        // If the suit of this card is less than the other, return 1
        if (o.getSuit().ordinal() < this.getSuit().ordinal())
            return 1;

            // If the suit of this card is greater than the other, return -1
        else if (o.getSuit().ordinal() > this.getSuit().ordinal())
            return -1;

            // Otherwise, same suit
        else {

            // If the number of this card is less than the other, return 1
            if (o.getRank().ordinal() < this.getRank().ordinal())
                return 1;

                // If the number of this card is greater than the other, return -1
            else if (o.getRank().ordinal() > this.getRank().ordinal())
                return -1;

            else
                return 0; // Should never happen!
        }
    }

    /**
     * Compares this card to another card to see if they are the same.
     * <p>
     * A card is considered equal to another card if the suit and number are the
     * same.
     *
     * @param other The other card to compare with
     * @return boolean
     */
    public boolean equals(Object other) {

        if (!(other instanceof Card))
            return false;

        Card otherCard = (Card) other;

        if (this.getSuit() == otherCard.getSuit()
                && this.getRank() == otherCard.getRank())

            return true;

        return false;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns a String that represents the value of this card.
     *
     * @return a string representation of the card
     */
    public String toString() {
        return rank + " of " + suit;
    }
}
