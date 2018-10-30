package trivera.core.collections.cards;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public int compareTo(Card o) {
        if (o.getSuit().ordinal() < this.getSuit().ordinal())
            return 1;
        else if (o.getSuit().ordinal() > this.getSuit().ordinal())
            return -1;
        else {
            if (o.getRank().ordinal() < this.getRank().ordinal())
                return 1;
            else if (o.getRank().ordinal() > this.getRank().ordinal())
                return -1;

            else
                return 0; // Should never happen!
        }
    }

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

    public String toString() {
        return rank + " of " + suit;
    }
}
