package builder;

/**
 * 문서를 만들 메소드들을 선언하고 있는 추상 클래스
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();       // 문서를 완성시키는 메소드

}
