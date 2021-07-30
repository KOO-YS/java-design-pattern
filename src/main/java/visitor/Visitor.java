package visitor;

/**
 * 방문자를 나타내는 추상 클래스
 * 방문할 곳의 데이터 구조(File, Directory)에 의존
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);

}
