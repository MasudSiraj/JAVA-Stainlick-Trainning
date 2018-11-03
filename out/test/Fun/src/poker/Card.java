package poker;

import java.util.Objects;

public class Card implements Comparable<Card>{


    private final Suit suit;
    private final Rank rank;
    private boolean faceUp = false;
    private int timesFlipped;

    public Card(Suit suit, Rank rank) {
        this.suit=suit;
        this.rank=rank;
    }


    public void flip(){
        faceUp = !faceUp;
        timesFlipped++;
    }

    boolean areYouFaceUp(){
        return faceUp;
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

        String side = faceUp ? "up" : "down";


        return rank + " of " + suit +
                " and I am face " + side + " and have been flipped " + timesFlipped + " times";
    }

    @Override
    public int compareTo(Card other) {

        int me = getSuit().ordinal()+getRank().ordinal();
        int otherInt = other.getSuit().ordinal()+other.getRank().ordinal();
        return -Integer.compare(     me, otherInt     );
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
}
