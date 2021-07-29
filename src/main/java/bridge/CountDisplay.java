package bridge;

/**
 * 기능의 클래스 계층
 * Display 클래스 + 기능 추가
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    // 지정횟수만큼 반복 표시 기능 추가
    public void multiDisplay(int times) {
        open();
        for (int i=0; i<times; i++) {
            print();
        }
        close();
    }
}
