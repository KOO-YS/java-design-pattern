package composite;

import java.util.ArrayList;

/**
 * (미완성)
 * 디렉토리를 나타내는 클래스
 */
public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> directory;
//    private int size;     X 없다. 디렉토리의 크기는 동적으로 계산해서 구하기 때문

    public Directory(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    protected void printList(String prefix) {

    }
}
