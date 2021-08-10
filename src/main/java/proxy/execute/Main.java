package proxy.execute;

import proxy.Printable;
import proxy.PrinterProxy;

public class Main {
    // PrintProxy를 경유해서 Printer를 이용하는 클래스
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 "+p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 "+p.getPrinterName() + "입니다.");
        // 본격적으로 프록시에서 본인이 생성된다
        // -> Printer의 인스턴스가 생성되는 것은 '본인'이 정말로 필요할 때
        p.print("Hello, world");

    }
}
