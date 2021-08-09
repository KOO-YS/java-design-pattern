package memento.practice;

import memento.game.Gamer;
import memento.game.Memento;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Memento memento = loadFileMemento();        // game.dat이 존재하면 저장되어 있는 상태에서 시작한다
        
        Gamer gamer = new Gamer(100);       // data가 없을 경우 100원으로 시작
        if (memento != null) gamer.restoreMemento(memento);
        else memento = gamer.createMemento();

        for (int i=0; i<100; i++) {
            System.out.println("===="+i);
            System.out.println("현상 : "+gamer);

            gamer.bet();        // 게임 진행

            System.out.println("소지금은 "+gamer.getMoney()+"이 되었습니다.");

            // Memento의 취급 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println(" (많이 증가했으므로 현재의 상태를 저장하자) ");
                memento = gamer.createMemento();
                saveMemento(memento);

            } else if (gamer.getMoney() < memento.getMoney()/2) {
                System.out.println(" (많이 감소했으므로 이전의 상태로 복원하자) ");
                gamer.restoreMemento(memento);
            }

            // 시간 기다림
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("");
            }
        }


    }
    static final String FILENAME = "game.dat";

    public static Memento loadFileMemento() {
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(FILENAME));
            memento = (Memento) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }

    public static void saveMemento(Memento memento) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(FILENAME));
            out.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
