package decorator;

public class FullBorder extends Border{

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+"+makeLine('-', display.getColumns()) + "+";       // 장식 상단
        } else if (row == display.getRows() + 1) {
            return "+"+makeLine('-', display.getColumns()) + "+";       // 장식 하단
        } else {
            return "|"+display.getRowText(row-1)+"|";           // 그 외
        }
    }

    private String makeLine(char ch, int count) {      // 문자 ch를 count개 연속시킨 문자열을 만든다
        StringBuffer buf = new StringBuffer();
        for (int i=0; i<count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
