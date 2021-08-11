package proxy.practice;

import proxy.Printable;
import proxy.Printer;

import java.lang.reflect.InvocationTargetException;

/**
 * Printer 클래스를 직접 알지 않고 '본인' 클래스 정보를 입력받아 사용할 수 있는 방식으로 수정
 */
public class PrinterProxy implements Printable {
    private String name;        // 이름
    // -> Proxy는 '본인'을 알지만, '본인'은 proxy를 알지 못한다
    // 연습문제 21-1
    private Printable real;         // 본인
    private String className;       // 본인 의 클래스명

    public PrinterProxy() {
    }

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);      // '본인'에게도 설정
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {      // 표시
        realize();
        real.print(string);
    }

    private synchronized void realize() { // 본인을 생성
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                System.err.println("클래스 "+className+"가 발견되지 않았습니다");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
