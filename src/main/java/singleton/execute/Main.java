package singleton.execute;

import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) System.out.println("the same instance");
        else System.out.println("different instance");

        System.out.println();
        System.out.println("End");
    }
}
