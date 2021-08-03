package observer.execute;

import observer.practice.IncrementalNumberGenerator;
import observer.*;
import observer.practice.BinaryObserver;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        // 관찰자
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        // 관찰자 등록
        generator.addObserver(observer1);
        generator.addObserver(observer2);

        // 수 생성
//        generator.execute();

        // 연습문제 17-1
        NumberGenerator practice = new IncrementalNumberGenerator(10, 50, 5);

        // 관찰자 등록
        practice.addObserver(observer1);
        practice.addObserver(observer2);
        // 연습문제 17-2
        Observer observer3 = new BinaryObserver();
        practice.addObserver(observer3);

        practice.execute();
    }
}
