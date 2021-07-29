package bridge;

/**
 * 구현 : 상위 클래스의 메소드를 구현
 */
public class StringDisplayImpl extends DisplayImpl{

    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine(width);
    }


    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void rawClose() {
        printLine(width);
    }
}
