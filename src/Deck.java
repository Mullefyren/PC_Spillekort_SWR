import java.util.Stack;

public class Deck extends Card{

    public Deck() {
    }

    public Deck(Suits suit, Ranks rank) {
        super(suit, rank);
    }

    public static Stack initializeDeck(Stack deck){
        for (Suits suit: Suits.values()) {
            for (Ranks rank: Ranks.values()) {
                Card card = new Card(suit, rank);
                deck.push(card);
            }
        }
        return deck;
    }
}
