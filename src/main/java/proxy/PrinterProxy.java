package proxy;

/**
 * 대리인의 역할
 *
 */
public class PrinterProxy implements Printable{
    private String name;        // 이름
    private Printer real;       // 본인
    // -> Proxy는 '본인'을 알지만, '본인'은 proxy를 알지 못한다

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
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

    private void realize() { // 본인을 생성
        if (real == null) {
            real = new Printer(name);
        }
    }
}
