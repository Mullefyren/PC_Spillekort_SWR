import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack deck = new Stack();
        System.out.println(Deck.initializeDeck(deck));
        Collections.shuffle(deck);
        System.out.println(deck);
        Play.letsPlay(deck);

    }
}
