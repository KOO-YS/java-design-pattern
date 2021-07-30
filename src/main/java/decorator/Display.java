package decorator;

/**
 * 복수 행으로 구성되는 문자열을 표시하기 위한 추상 클래스
 */
public abstract class Display {
    public abstract int getColumns();       // 가로 문자 수
    public abstract int getRows();          // 새로 행 수
    public abstract String getRowText(int row); // row번째 문자열
    public final void show() {      // 전부 표시
        for(int i=0; i<getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
