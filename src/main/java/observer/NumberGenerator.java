package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 수를 생성하는 추상 클래스
 * 실제 수의 생성(execute)과 수를 취득하는 메소드(getNumber)
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();      // Observer를 저장
    public void addObserver(Observer observer) {        // Observer를 추가
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {     // Observer를 삭제
        observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();        // 수를 취득
    public abstract void execute();         // 수를 생성한다
}
