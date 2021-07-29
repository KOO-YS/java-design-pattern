package strategy;

import java.util.Random;

/**
 * 다음 손은 언제나 난수로 결정하지만, 
 * 과거의 승패의 이력을 사용해 각각의 손을 낼 확률을 바꾼다
 */
public class ProbStrategy implements Strategy{
    private Random random;
    private int prevHandKind = 0;
    private int currentHandKind = 0;
    // 과거의 승패를 반영한 확률계산을 위한 표
    private int[][] history = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public HAND nextHand() {
        int bet = random.nextInt(getSum(currentHandKind));
        int handValue = 0;

        if (bet < history[currentHandKind][0]) {
            handValue = 0;
        } else if(bet < (history[currentHandKind][0]+history[currentHandKind][1])) {
            handValue = 1;
        } else {
            handValue = 2;
        }

        prevHandKind = currentHandKind;
        currentHandKind = handValue;
        return HAND.fromInt(handValue);
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[prevHandKind][currentHandKind]++;
        } else {
            history[prevHandKind][(currentHandKind + 1)%3]++;
            history[prevHandKind][(currentHandKind + 2)%3]++;
        }
    }
    private int getSum(int hv) {
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
}
