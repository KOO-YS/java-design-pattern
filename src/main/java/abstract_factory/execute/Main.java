package abstract_factory.execute;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;
import abstract_factory.listfactory.ListFactory;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage : java Main class.name.of.ConcreteFactory");
            System.out.println("Usage : java Main abstract_factory.listfactory.ListFactory");       // 앞 패키지명까지!!
            System.out.println("Usage : java Main tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory(args[0]);

        Link naver = factory.createLink("NAVER", "www.naver.com");
        Link google = factory.createLink("google", "www.google.com");

        Link github = factory.createLink("github", "www.github.com");
        Link algorithm = factory.createLink("solved algo", "solved.ac");


        Tray portal = factory.createTray("portal");
        portal.add(naver);
        portal.add(google);

        Tray coding = factory.createTray("coding");
        coding.add(github);
        coding.add(algorithm);

        Page page = factory.createPage("LinkPage", "디자인패턴");
        page.add(portal);
        page.add(coding);

        page.output();
    }
}
