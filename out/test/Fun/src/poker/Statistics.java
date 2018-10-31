package poker;

public class Statistics {


    // print the number of cards you had to remove before there was no longer
    // an ace of spades

    public static void main(String[] args) {

        Card aceOfSpades = new Card(Suit.Spade,Rank.Ace );
        new Card(Suit.Spade,Rank.Ace );

        PokerMachine pokerMachine = new PokerMachine();

        int cardsPulledToScore = cardsPulledBeforeMatch(aceOfSpades, pokerMachine);

        System.out.println(cardsPulledToScore + " cards pulled to get the " + aceOfSpades);

    }















    private static int cardsPulledBeforeMatch(Card card, PokerMachine pokerMachine) {
        int cardsPulledToScore=0;

        while(true){
            cardsPulledToScore++;
            if (pokerMachine.getTopCard().equals(card)){
                break;
            }
        }
        return cardsPulledToScore;
    }


}
