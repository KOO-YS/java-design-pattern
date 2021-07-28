package abstract_factory.listfactory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;

/**
 * Factory의 추상 메소드들을 구현하고 있다
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String caption, String author) {
        return new ListPage(caption, author);
    }
}
