package observer;

/**
 * Observer 인터페이스를 구현하는 클래스로 관찰한 수를 '숫자'로 표시하기 위한 것
 */
public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver : "+generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
