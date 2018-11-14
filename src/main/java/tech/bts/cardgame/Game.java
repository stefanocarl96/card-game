package tech.bts.cardgame;

public class Game {

    private final Player player1;
    private final Player player2;
    private final Deck deck;

    public final static int INITIAL_HAND_SIZE = 5;
    public final static int FINAL_HAND_SIZE = 3;
    public final static int NUM_CARDS_TO_DISCARD = INITIAL_HAND_SIZE - FINAL_HAND_SIZE;


    public Game(Player player1, Player player2, Deck deck) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
    }

    public void play() {

        // Battle

        // 1- deal the cards
        Hand hand1 = deck.deal(FINAL_HAND_SIZE);
        Hand hand2 = deck.deal(FINAL_HAND_SIZE);

        //player1.setHand(hand1);
        //player2.setHand(hand2);

        // TODO: 2- discard the cards

        // 3- fight with the cards
        int result = compare(hand1, hand2);

        System.out.println("hand 1: " + hand1);
        System.out.println("hand 2: " + hand2);

        // TODO: print the name of the player that wins this battle
        System.out.println("The winner is: xxx");
    }

    /**
     * Returns a negative integer, zero, or a positive integer
     * as the first hand is less than, equal to,
     * or greater than the second hand.
     */
    private int compare(Hand hand1, Hand hand2) {

        int points1 = 0;
        int points2 = 0;

        Card total1 = hand1.calculate();
        Card total2 = hand2.calculate();

        if (total1.getMagic() > total2.getMagic()) {
            points1++;
        } else if (total1.getMagic() < total2.getMagic()) {
            points2++;
        }

        // TODO: do the same with strength and intelligence

        return points1 - points2;
    }
}
