package prototype.framework;

import java.util.HashMap;

/**
 * Product 인터페이스를 이용해서 인스턴스의 복제를 실행하는 클래스
 * HashMap<이름, 인스턴스>
 *
 * framework 클래스에는 하위 클래스의 클래스 이름이 전혀 나오지 않는다
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
