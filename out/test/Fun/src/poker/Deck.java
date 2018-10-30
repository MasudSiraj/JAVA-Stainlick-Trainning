package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    Deck(){
        createCards();
        Collections.shuffle(this);
    }

    private void createCards() {
        for( Suit suit: Suit.values() ){
            for(Rank rank: Rank.values()){
                add(new Card(suit,rank));
            }
         }
    }

}
