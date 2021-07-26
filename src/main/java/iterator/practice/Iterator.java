package iterator.practice;

/**
 * 하나씩 나열하면서 검색을 실행하는 인터페이스
 */
public interface Iterator {
    public abstract boolean hasNext();      // loop의 종료 조건  
    public abstract Object next();          // 집합체 요소 1개 반환
}
