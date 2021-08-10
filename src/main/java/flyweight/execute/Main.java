package flyweight.execute;

import flyweight.BigString;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage : java Main digits");
            System.out.println("Example : java Main 1212123");
            System.exit(0);
        }
//        BigString bs = new BigString(args[0]);
//        bs.print();

        // 연습문제 20-1
        BigString practice1 = new BigString(args[0], true);
        practice1.print();
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("1 사용 메모리 "+used);       // 1 사용 메모리 1257472


        // 공유한

        BigString practice2 = new BigString(args[0], false);
        practice2.print();
        Runtime.getRuntime().gc();
        long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("2 사용 메모리 "+used2);      // 2 사용 메모리 1289552

    }
}
