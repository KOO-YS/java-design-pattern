package prototype.practice;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen pen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("strong message", pen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        Product p1 = manager.create("strong message");
        p1.use("hello world");
        System.out.println();
        Product p2 = manager.create("warning box");
        p2.use("hello world");
        System.out.println();
        Product p3 = manager.create("slash box");
        p3.use("hello world");

    }
}
