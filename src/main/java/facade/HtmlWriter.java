package facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 간단한 웹 페이지 작성
 * 인스턴스 작성 시에 Writer를 제공하고 그 Writer에 대해서 HTML을 출력
 */
public class HtmlWriter {
    private Writer writer;
    public HtmlWriter(Writer writer) {      // 생성자
        this.writer = writer;
    }
    // 타이틀 출력
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>"+title+"</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>"+title+"</h1>");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>"+msg+"</p>");
    }

    // 링크 출력
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\""+href+"\">"+caption+"</a>");
    }
    
    // 메일 주소 출력
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto : "+mailaddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
