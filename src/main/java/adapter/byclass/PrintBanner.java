package adapter.byclass;

/**
 * 어댑터의 역할 완수
 *
 * '이미 제공되는 기능'을 상속받아 '필요한 기능'을 구현
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
