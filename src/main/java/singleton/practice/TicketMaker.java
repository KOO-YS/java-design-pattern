package singleton.practice;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        System.out.println("count : "+getNextTicketNumber());
        return ticketMaker;
    }
    private static int ticket = 1000;
    public static int getNextTicketNumber() {
        return ticket++;
    }

    @Override
    public String toString() {
        return "TicketMaker{" +
                "ticket=" + ticket +
                '}';
    }
}
