package strategy;

import java.util.Random;

/**
 * 직전 승부에서 이겼으면 다음에도 같은 손을 내고,
 * 졌다면 난수를 사용해 결정
 */
public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private HAND prevHand;
    public WinningStrategy(int seed) {
        // seed가 같으면 같은 난수를 생성해낸다 
        // default : 현재 시간을 이용
        random = new Random(seed);
    }

    @Override
    public HAND nextHand() {
        if(!won) {
            prevHand = HAND.fromInt(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
