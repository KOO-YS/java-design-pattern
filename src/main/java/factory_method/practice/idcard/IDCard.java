package factory_method.practice.idcard;      // 인식번호 카드(product & factory)를 위한 패키지 구성

import factory_method.practice.framework.Product;

/**
 * 인식번호 카드(제품)를 구현한 클래스
 */
public class IDCard extends Product {
    private String owner;
    private int idx;

    IDCard(String owner, int idx) {
        System.out.println(owner+"의 카드를 만듭니다. -- > id : "+idx);
        this.owner = owner;
        this.idx = idx;
    }

    @Override
    public void use() {
        System.out.println(owner+"의 카드를 사용합니다. -- > id : "+idx);
    }

    public String getOwner() {
        return owner;
    }
}
