package strategy.execute;

import strategy.HAND;
import strategy.Player;
import strategy.ProbStrategy;
import strategy.WinningStrategy;

public class Main {
    public static void main(String[] args) {
        int seed1 = 314;
        int seed2 = 15;

        Player player1 = new Player("ONE", new WinningStrategy(seed1));
        Player player2 = new Player("TWO", new ProbStrategy(seed2));

        for(int i=0; i<10000; i++) {
            HAND nextHand1 = player1.nextHand();
            HAND nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
//                System.out.println("Winner : " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
//                System.out.println("Winner : " + player2);
                player2.win();
                player1.lose();
            } else {
                player1.even();
                player2.even();
            }
        }
        System.out.println("TOTAL RESULT : ");
        System.out.println(player1);
        System.out.println(player2);
    }
}
