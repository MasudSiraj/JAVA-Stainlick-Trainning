package poker;

import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;

public class Statistics {


    // print the number of cards you had to remove before there was no longer
    // an ace of spades

    public static void main(String[] args) {

//        Card aceOfSpades = new Card(Suit.Spade,Rank.Ace );
//        new Card(Suit.Spade,Rank.Ace );
//
//        PokerMachine pokerMachine = new PokerMachine();
//
//        int cardsPulledToScore = cardsPulledBeforeMatch(aceOfSpades, pokerMachine);
//
//        System.out.println(cardsPulledToScore + " cards pulled to get the " + aceOfSpades);

        //trySortingNatural();
        // trySortingBySuit();
        //tryLambdaFilter();
        //tryStreamSortOne();
        //System.out.println("**********************************************");
        //tryStreamSortTwo();
        tryFlip();

    }

    private static void tryFlip() {
        Card aceOfSpades = new Card(Suit.Spade, Rank.Ace);
        System.out.println(aceOfSpades);

        aceOfSpades.flip();
        System.out.println(aceOfSpades);

        aceOfSpades.flip();
        System.out.println(aceOfSpades);
    }



    private static void trySortingNatural() {
        Deck deck = new Deck();
        Collections.sort(deck);
        for (Card c : deck) {
            System.out.println(c);
        }
    }


















    private static void trySortingBySuit() {

        Deck deck = new Deck();
        Collections.sort(deck, new SortBySuit());
        for (Card c : deck) {
            System.out.println(c);
        }
    }

    private static void tryLambdaFilter() {
        Deck deck = new Deck();

        deck.parallelStream()
            .filter(card -> card.getRank()==Rank.Ace )
            .forEach(System.out::println);
    }




    private static void tryStreamSortOne() {
        Deck deck = new Deck();

        deck.stream()
            .sorted(comparing(Card::getSuit).thenComparing(Card::getRank))
            .forEach(System.out::println);
    }









    private static void tryStreamSortTwo() {
        Deck deck = new Deck();

        deck.stream()
            .sorted(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit))
            .forEach(System.out::println);
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
