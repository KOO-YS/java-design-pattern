package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 게임을 실행하는 주인공을 표현하는 클래스
 */
public class Gamer {    
    private int money;                          // 소지금
    private List fruits = new ArrayList();      // 과일
    private Random random = new Random();       // 난수발생기
    private static String[] fruitsname = {
            "사과", "포도", "바나나", "귤"
    };
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if(dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반이 되었습니다.");
        } else if (dice == 6) {
            String f = getFruit();
        }

    }

    private String getFruit() {
        String prefix = "";

        return prefix;
    }

}
