package visitor.practice;

import visitor.Directory;
import visitor.Entry;
import visitor.File;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindvisitor extends Visitor {
    private ArrayList<File> files;
    private static String extension;

    public FileFindvisitor(String extension) {
        this.files = new ArrayList<>();
        this.extension =extension;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(extension)) files.add(file);
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }
}
