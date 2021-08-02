package chain_of_responsibility.execute;

import chain_of_responsibility.*;

public class Main {
    public static void main(String[] args) {
        Support a = new NoSupport("A");
        Support b = new LimitSupport("B", 100);
        Support c = new SpecialSupport("C", 429);
        Support d = new LimitSupport("D", 200);
        Support e = new OddSupport("E");
        Support f = new LimitSupport("F", 300);

        // 사슬의 형성
        a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);

        // 다양한 트러블 발생
        for (int i=0; i<500; i += 33) {
            a.support(new Trouble(i));
        }
        
    }

}
