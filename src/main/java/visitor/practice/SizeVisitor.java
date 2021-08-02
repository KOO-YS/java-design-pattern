package visitor.practice;

import visitor.Directory;
import visitor.Entry;
import visitor.File;
import visitor.Visitor;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
}
