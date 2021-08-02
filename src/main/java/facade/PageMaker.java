package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Database와 HtmlWriter 클래스를 조합해서 지정한 사용자의 웹 페이지를 작성하기 위한 것
 *
 * HtmlWriter 클래스의 메소드를 호출하는 곳은 이 PageMaker 클래스가 혼자 인수해서,
 * 외부에 대해서는 단 하나의 메소드만 보인다 -> 그게 makeWelcomePage
 */
public class PageMaker {
    private PageMaker() {       // 인스턴스는 만들지 않는다
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to "+username+"'s page");
            writer.paragraph(username+"의 페이지에 오신 걸 환영합니다");
            writer.paragraph("Waiting for mail");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename+" is created for "+mailaddr+" ("+username+")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            Iterator<String> usernames = mailprop.stringPropertyNames().iterator();
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            while (usernames.hasNext()) {
                String email = usernames.next();
                writer.mailto(email, mailprop.getProperty(email));
            }
            writer.close();
            System.out.println(filename+" is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
