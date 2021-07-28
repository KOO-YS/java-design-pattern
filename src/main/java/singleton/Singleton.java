package singleton;

/**
 * singleton은 static 필드로서 Singleton 클래스의 인스턴스에서 초기화된다
 * -> 클래스 로드할 때 1회 실행
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    // Singleton 클래스 외부에서 생성자의 호출 금지
    private Singleton() {
        System.out.println("인스턴스를 생성");
    }
    
    // Singleton 클래스의 유일하게 인스턴스를 얻는 메소드
    public static Singleton getInstance() {
        return singleton;
    }
}
