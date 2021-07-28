package singleton.practice.execute;

import singleton.practice.TicketMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        TicketMaker obj1 = TicketMaker.getInstance();
        TicketMaker obj2 = TicketMaker.getInstance();

        if (obj1 == obj2) System.out.println("the same instance");
        else System.out.println("different instance");

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        System.out.println();
        System.out.println("End");
    }
}
