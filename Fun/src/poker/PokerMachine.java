package poker;

public class PokerMachine {

    private Deck cards = new Deck();

    public Card getTopCard(){
        if (cards.size()==0){
            cards = new Deck();
        }
        return cards.remove(0);
    }

    public boolean doYouContainThisCard(Card card){
        return cards.contains(card);
    }

}
