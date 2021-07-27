package factory_method.idcard;      // 인식번호 카드(product & factory)를 위한 패키지 구성

import factory_method.framework.Product;

/**
 * 인식번호 카드(제품)를 구현한 클래스
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner+"의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner+"의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
