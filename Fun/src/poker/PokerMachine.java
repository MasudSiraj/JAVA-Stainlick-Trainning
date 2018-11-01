package poker;

public class PokerMachine {

    private Deck cards = new Deck();

    public Card getTopCard(){
        if (cards.size()==0){
            cards = new Deck();
        }
        return cards.remove(0);
    }



    public Card[] getTopCard(int howManyCards){
        Card handOfCards[] = new Card[howManyCards];
        for(  int i=0; i<howManyCards; i++){
            handOfCards[i]= getTopCard();
        }
        return handOfCards; 
    }


    public boolean doYouContainThisCard(Card card){
        return cards.contains(card);
    }

}
