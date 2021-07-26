package template_method;

/**
 * 메소드 display만 구현되고 있는 추상 클래스
 */
public abstract class AbstractDisplay {

    public final void display() {
        open();
        for (int i=0; i<5; i++) {
            print();
        }
        close();
    }

    // 하위 클래스에 구현을 맡기는 추상 메소드들
    // -> 이 메소드들이 실제로 무엇을 하는지 AbstractDisplay만 보고 알 수 없다
    public abstract void open();
    public abstract void print();
    public abstract void close();
}
