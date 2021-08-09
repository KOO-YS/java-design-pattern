package memento.execute;

import memento.game.Gamer;
import memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);             // 최초의 소지금 100
        Memento memento = gamer.createMemento();        // 최소 상태를 저장해둔다
        for (int i=0; i<100; i++) {
            System.out.println("===="+i);
            System.out.println("현상 : "+gamer);

            gamer.bet();        // 게임 진행

            System.out.println("소지금은 "+gamer.getMoney()+"이 되었습니다.");

            // Memento의 취급 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println(" (많이 증가했으므로 현재의 상태를 저장하자) ");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()/2) {
                System.out.println(" (많이 감소했으므로 이전의 상태로 복원하자) ");
                gamer.restoreMemento(memento);      // 이전 필드 값으로 덮어쓰기
            }

            // 시간 기다림
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("");
            }
        }

        /* narrow interface */
        // gamer.getMoney(); -> public : caretaker역할도, 다른 클래스들이 외부에서도 확인 가능
        /* wide interface */
        // gamer.getFruit(); ->

        // 18-3
        // memento.getNumber(); -> Main에서는 number에 접근할 수 없다
    }
}
