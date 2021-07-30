package decorator.practice;

import decorator.Display;
import decorator.FullBorder;
import decorator.SideBorder;
import decorator.StringDisplay;

public class Main {
    public static void main(String[] args) {
        // 12 - 1
        Display b1 = new StringDisplay("Hello world");
        Display b2 = new UpdownBorder(b1, '-');
        Display b3 = new SideBorder(b2, '*');

        b1.show();
        b2.show();
        b3.show();

        Display b4 =
                new FullBorder(
                        new UpdownBorder(
                                new SideBorder(
                                        new UpdownBorder(
                                                new SideBorder(
                                                        new StringDisplay("안녕하세요"), '*'
                                                ), '='
                                        ), '|'
                                ), '/'
                        )
                );

        b4.show();

        // 12 - 2
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("좋은 아침입니다");
        md.add("안녕하세요.");
        md.add("안녕히 주무세요 내일 만나요");

        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();
        Display d2 = new FullBorder(md);
        d2.show();
    }
}
