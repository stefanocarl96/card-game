package tech.bts.cardgame;

public class Example {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.generate();
        deck.shuffle();

        Card card = deck.pickCard();

        System.out.println("I've picked the card: " + card);

        Player player1 = new Player("Peter");
        Player player2 = new Player("Mary");

        Game game = new Game(player1, player2, deck);

        game.play();
    }
}
