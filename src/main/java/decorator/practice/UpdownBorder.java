package decorator.practice;

import decorator.Border;
import decorator.Display;
import decorator.FullBorder;

public class UpdownBorder extends Border {
    private char borderCh;
    public UpdownBorder(Display display, char ch) {
        super(display);
        borderCh = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;        // 위아래
    }

    @Override
    public String getRowText(int row) {
        if( row == 0) {
            return makeLine(borderCh, display.getColumns());
        } else if(row == display.getRows()+1) {
            return makeLine(borderCh, display.getColumns());
        }
        return display.getRowText(row-1);
    }
    private String makeLine(char ch, int count) {      // 문자 ch를 count개 연속시킨 문자열을 만든다
        StringBuffer buf = new StringBuffer();
        for (int i=0; i<count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
