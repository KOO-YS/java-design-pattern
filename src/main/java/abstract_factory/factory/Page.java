package abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * HTML 페이지 전체를 추상적으로 표현한 클래스
 * Link, Tray가 '부품'이라면, Page는 완성된 '제품'이다
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title+".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());      // 자기자신의 makeHTML 메소드인 점을 강조
            writer.close();
            System.out.println(filename+"을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String makeHTML();
}
