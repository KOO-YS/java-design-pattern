package observer;

/**
 * 관찰자를 표현하는 인터페이스
 * java 클래스 라이브러리 java.util.Observer 와는 다르다
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
