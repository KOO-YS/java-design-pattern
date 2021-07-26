package template_method;

/**
 * 메소드 open, print, close를 구현하고 있는 하위 클래스
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>\n");
    }
}
