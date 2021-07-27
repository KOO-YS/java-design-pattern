package factory_method.practice.execute;

import factory_method.practice.framework.Factory;
import factory_method.practice.framework.Product;
import factory_method.practice.idcard.IDCard;
import factory_method.practice.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");

//        IDCard test = new IDCard();

        System.out.println();

        card1.use();
        card2.use();
        card3.use();
    }
}
