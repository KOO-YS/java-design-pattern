package proxy;

/**
 * '본인'을 표시하는 클래스
 */
public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob("Printer의 인스턴스 생성 중");
    }

    public Printer(String name) {
        this.name = name;
        /* 프린터 '본인'을 생성하기 위해서는 많은 시간이 걸린다는 것을 전제 */
        heavyJob("Printer의 인스턴스("+name+")을 생성 중");
    }

    public void setPrinterName(String name) {       // 이름의 설정
        this.name = name;
    }

    public String getPrinterName() {
        return name;
    }

    public void print(String string) {      // 이름 붙여서 표시
        System.out.println("=== "+name+" ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("finish");
    }
}
