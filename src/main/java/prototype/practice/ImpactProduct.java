package prototype.practice;

import prototype.framework.Product;

public abstract class ImpactProduct implements Product {
    public abstract void use(String s);
    
    // 같은 로직의 createClone은 ImpactProduct에서 직접 구현한다
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
