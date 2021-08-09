package memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 주인공의 상태를 표현하는 클래스
 */
public class Memento implements Serializable {
    int money;      // 소지금
    ArrayList fruits;   // 과일
    // 18-3
    private int number;
    int getNumber() {
        return number;
    }

    // 동일한 패키지 내에 속해있는 클래스에서만 사용 가능
    /* wide interface */
    Memento(int money) {
        this.money = money;
        fruits = new ArrayList();
    }
    /* wide interface */
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    // 패키지 외부에서 Memento의 내부를 변경할 수 없다
    /* wide interface */
    List getFruits() {
        return (List)fruits.clone();
    }

    /* narrow interface */
    public int getMoney() {
        return money;
    }

}
