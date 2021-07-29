package bridge.practice;

import bridge.CountDisplay;
import bridge.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    // 0 이상 times 미만인 경우에만 랜덤으로 표시
    public void randomDisplay(int times) {
        int count = (int) (Math.random() * times);
        multiDisplay(count);
    }
}
