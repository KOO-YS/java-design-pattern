package abstract_factory.factory;

/**
 * Link, Tray의 상위 클래스 -> 객체 요소들을 동일시하기 위한 클래스
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
    // HTML 문자열 반환
    public abstract String makeHTML();
}
