package abstract_factory.factory;

import java.util.ArrayList;

/**
 * 복수의 Tray나 Link를 모아서 합친 것을 표시한 클래스
 */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
