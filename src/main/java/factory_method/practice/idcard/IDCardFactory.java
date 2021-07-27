package factory_method.practice.idcard;

import factory_method.practice.framework.Factory;
import factory_method.practice.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * IDCard 인스턴스를 생성해서 제품을 만드는 일을 구현한 클래스
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();
    private int idx = 0;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, idx++);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
