package adapter.byinstance;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
