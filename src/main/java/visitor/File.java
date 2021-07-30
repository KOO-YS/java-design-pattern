package visitor;

/**
 * 파일을 표현하는 클래스
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {       // 상위에서 위임된 메소드를 여기서 구현
        System.out.println(prefix+"/"+this);
        // 상위 클래스의 toString 상속 -> this => name(size)
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
