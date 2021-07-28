package prototype.practice;

import prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    /**
     * 테투리 감싸기
     */
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i=0; i<length+4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar+" "+s+" "+decochar);
        for (int i=0; i<length+4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            // Product는 Cloneable 인터페이스를 구현하고 있기 때문에 에러가 발생할 일이 없긴하다
            e.printStackTrace();    
        }
        return p;
    }
}
