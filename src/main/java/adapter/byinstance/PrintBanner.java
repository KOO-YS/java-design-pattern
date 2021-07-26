package adapter.byinstance;

/**
 * 어댑터의 역할 완수
 * 
 * '이미 제공되는 기능'을 상속받아 '필요한 기능'을 구현
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
