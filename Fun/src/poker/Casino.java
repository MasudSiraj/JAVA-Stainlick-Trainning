package poker;



public class Casino {

    PokerMachine pokerMachine = new PokerMachine();

    Casino(){
        play();
    }

    private void play() {

        Card aceOfSpades = new Card(Suit.Spade,Rank.Ace );
        System.out.println( pokerMachine.doYouContainThisCard(aceOfSpades)   );

    }







    public static void main(String[] args) {
        new Casino();
    }
}
