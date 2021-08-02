package visitor.practice;

import facade.PageMaker;
import visitor.Directory;
import visitor.File;
import visitor.ListVisitor;

import java.util.Iterator;

/**
 * Composite 패턴의 Main 클래스와 거의 동일하지만,
 * Directory 내용을 표시하기 위해, 표시를 행하는 방문자 ListVisitor의 인스턴스를 사용
 *
 * Composite 패턴에서는 디렉토리를 표시하기 위해 printList 메소드를 클래스에 직접 구현해서 사용했다.
 * 이에 반해 
 * Visitor 패턴에서는 표시하는 것도  Visitor 클래스에서 실행한다
 */
public class Main {
    public static void main(String[] args) {
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));

        Directory Kim = new Directory("Kim");
        Directory Lee = new Directory("Lee");
        Directory Park = new Directory("Park");

        usrdir.add(Kim);
        usrdir.add(Lee);
        usrdir.add(Park);

        Kim.add(new File("diary.html", 100));
        Kim.add(new File("Composite.java", 200));
        Kim.add(new File("memo.tex", 300));
        Lee.add(new File("index.html", 350));
        Lee.add(new File("game.doc", 400));
        Park.add(new File("junk.mail", 500));

        FileFindvisitor ffv = new FileFindvisitor(".html");
        rootdir.accept(ffv);

        System.out.println("HTML files are : ");
        Iterator it = ffv.getFoundFiles();
        while (it.hasNext()) {
            File file = (File)it.next();
            System.out.println(file.toString());
        }
    }
}
