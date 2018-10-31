package poker;



public class Casino {

    PokerMachine pokerMachine = new PokerMachine();

    Casino(){
        play();
        playHand();
        playRanks();
    }

    private void playRanks() {
        Rank rank = Rank.valueOf("Four");
        System.out.println(rank);
    }

    private void play() {
        Card aceOfSpades = new Card(Suit.Spade,Rank.Ace );
        System.out.println( pokerMachine.doYouContainThisCard(aceOfSpades)   );
    }

    private void playHand() {
        Card myHand[] = pokerMachine.getTopCard(7);
        for (Card c: myHand) {
            System.out.println(c);
        }
    }





    public static void main(String[] args) {
        new Casino();
    }
}
