public class Card implements Comparable{
    private Suits suit;
    private Ranks rank;

    public Card() {
    }

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank +" of " + suit;
    }

    @Override
    public int compareTo(Object o) {
        Card c = (Card) o;
        if (this.rank.compareTo(c.getRank()) > 0){
            return 1;
        } else if (this.rank.compareTo(c.getRank()) == 0){
            if (this.suit.compareTo(c.getSuit()) != 0 && this.suit.compareTo(c.getSuit()) > 0){
                return 1;
            } else
                return -1;
       } else
           return -1;
    }
}




