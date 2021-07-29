package strategy.practice;

import strategy.HAND;
import strategy.Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public HAND nextHand() {
        return HAND.fromInt(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
