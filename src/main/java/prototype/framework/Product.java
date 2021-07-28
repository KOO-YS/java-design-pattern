package prototype.framework;

/**
 * 복제를 가능하게 하는 인터페이스
 */
public interface Product extends Cloneable{     // -> 복제 가능. Cloneable 구현 인스턴스는 clone 메소드를 사용해서 자동적으로 복제할 수 있습니다.
    public abstract void use(String s);
    // 자기 자신을 복제하는 메소드
    public abstract Product createClone();
}
