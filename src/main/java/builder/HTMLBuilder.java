package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String filename;        // 작성할 파일명
    private PrintWriter writer;     // 파일에 기술할 PrintWriter
    @Override
    public void makeTitle(String title) {
        filename = title+".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));     // PrintWriter를 만든다
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>"+title+"</title></head><body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for(int i=0; i<items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;        // 파일명 반환
    }
}
