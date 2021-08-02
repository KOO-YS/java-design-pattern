package facade.execute;

import facade.PageMaker;

public class Main {
    public static void main(String[] args) {
        // Facade를 이용해 간단 html 완성!
        PageMaker.makeWelcomePage("test@example.com", "welcome.html");

        // 연습문제 15-2
        PageMaker.makeLinkPage("linkpage.html");
    }
}
