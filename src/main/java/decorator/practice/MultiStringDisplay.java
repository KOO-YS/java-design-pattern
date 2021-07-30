package decorator.practice;

import decorator.Display;
import decorator.StringDisplay;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private int width = Integer.MIN_VALUE;
    List<StringDisplay> list;

    public MultiStringDisplay() {
        list = new ArrayList<>();
    }

    @Override
    public int getColumns() {
        return width;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        return list.get(row).getRowText(0);
    }

    public void add(String str) {
        list.add(new StringDisplay(str));
        width = Math.max(width, str.getBytes().length);
    }
}
