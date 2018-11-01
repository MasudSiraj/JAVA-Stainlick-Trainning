package poker;

import java.util.Objects;

public class Card implements Comparable<Card>{


    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(Card o) {
        return -Integer.compare(     getRank().ordinal(), o.getRank().ordinal()          );
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
