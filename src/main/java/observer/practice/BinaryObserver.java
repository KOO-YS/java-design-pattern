package observer.practice;

import observer.NumberGenerator;
import observer.Observer;

public class BinaryObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("BinaryObserver : "+Integer.toBinaryString(generator.getNumber()));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
