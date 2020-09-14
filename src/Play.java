import java.util.Stack;

public class Play {

    public static void letsPlay(Stack deck){
        int countPlayer1 = 0;
        int countPlayer2 = 0;
        while(deck.size() != 0) {
            Card player1 = (Card) deck.pop();
            Card player2 = (Card) deck.pop();
            int winner = player1.compareTo(player2);
            switch (winner) {
                case 1:
                    winnerIs(player1, player2);
                    System.out.println("The winner of this round is Player 1!");
                    countPlayer1 += 1;
                    System.out.println("Score: \nP1: " + countPlayer1 + " P2: " + countPlayer2);
                    break;
                case -1:
                    winnerIs(player1, player2);
                    System.out.println("The winner of this round is Player 2!");
                    countPlayer2 += 1;
                    System.out.println("Score: \nP1: " + countPlayer1 + " P2: " + countPlayer2);
                    break;
                default:
                    break;
            }
        }
        if (countPlayer1 > countPlayer2){
            System.out.println("Player 1 is the winner of the entire game!");
        } else if (countPlayer2 > countPlayer1){
            System.out.println("Player 2 is the winner of the entire game!");
        } else
            System.out.println("It's a god damn draw yall!");
    }
    public static void winnerIs(Card player1, Card player2){
        System.out.println("Player 1 draw: " + player1.getRank() + " of " + player1.getSuit() + " & " + "\nPlayer 2 draw: " + player2.getRank() + " of " + player1.getSuit());
    }
}
