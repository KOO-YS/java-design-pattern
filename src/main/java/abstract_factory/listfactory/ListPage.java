package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String caption, String author) {
        super(caption, author);
    }

    @Override
    public void add(Item item) {
        super.add(item);
    }

    @Override
    public void output() {
        super.output();
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while(it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>\n");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
