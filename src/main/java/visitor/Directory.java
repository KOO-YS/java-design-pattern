package visitor;

import visitor.practice.SizeVisitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 디렉토리를 나타내는 클래스
 */
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();     // 엔트리 집합
//    private int size;     X 없다. 디렉토리의 크기는 동적으로 계산해서 구하기 때문

    public Directory(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
//        int size = 0;
//        Iterator it = directory.iterator();
//        while(it.hasNext()) {
//            Entry entry = (Entry) it.next();
//            size += entry.getSize();        // 재귀
//        }
//        return size;

        SizeVisitor sv = new SizeVisitor();
        this.accept(sv);

        return sv.getSize();
    }

    @Override
    public Entry add(Entry entry) {     // 엔트리 추가
        directory.add(entry);
        entry.parent = this;
        return this;
    }
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix+"/"+name);
        }
    }

    public Iterator iterator() {
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
