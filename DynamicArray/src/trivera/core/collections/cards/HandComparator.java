package trivera.core.collections.cards;

import java.util.Comparator;

/**
 * Sorts two cards, prioritizing on number, then on suit.
 *
 * This class is used to sort cards first by face value, then by suit. It is
 * used when displaying a player's hand. This makes it easier to see 2 of a
 * kind, 3 of a kind, etc.
 *
 */

public class HandComparator implements Comparator<Card> {
    /**
     * Compares this card with the specified card for order.
     *
     * A card is determined to be less than another card by comparing its suit
     * and its number. The priority is to first compare the face values. Only if
     * the face values are equal are the suits then compared. This makes for
     * good hand sorting, but inappropriate for deck sorting.
     *
     * @param o1
     *            the Card to be compared.
     * @param o2
     *            the Card to be compared.
     * @return a negative integer, zero, or a positive integer if the first Card
     *         is less than, equal to, or greater than the second Card.
     *
     * @throws ClassCastException
     *             if the specified object's type is not Card
     */

    public int compare(Card o1, Card o2) {

//        if ((!(o1 instanceof Card)) || (!(o2 instanceof Card)))
//            throw new ClassCastException();

        Card c1 = (Card) o1;
        Card c2 = (Card) o2;

        if (c1.getRank().ordinal()< c2.getRank().ordinal())
            return -1;

        else if (c1.getRank().ordinal() > c2.getRank().ordinal())
            return 1;

        else {

            if (c1.getSuit().ordinal() < c2.getSuit().ordinal())
                return -1;

            else if (c1.getSuit().ordinal() > c2.getSuit().ordinal())
                return 1;

            else
                return 0; // Should never happen!
        }
    }
}
