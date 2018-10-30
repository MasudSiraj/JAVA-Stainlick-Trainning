package trivera.core.collections.cards;

import jdk.nashorn.internal.runtime.JSType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

    private List<Card> deck;

    public Deck() {
        newDeck();
        shuffle();
    }


    public List<Card> dealCards(int count) {
        List<Card> cardHand = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            Card topCard = (Card) deck.remove(0);
            cardHand.add(topCard);
        }
        Collections.sort(cardHand, new HandComparator());

        return cardHand;
    }

    public List<Card> showDeck() {
        List<Card> cardList = new ArrayList<Card>(deck);
        Collections.sort(cardList);
        return Collections.unmodifiableList(cardList);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    private void newDeck() {
        this.deck = new ArrayList<Card>(52);

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                this.deck.add(new Card(suit, rank));
            }
        }
    }
}
