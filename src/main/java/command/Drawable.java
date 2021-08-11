package command;

import java.awt.*;

/**
 * '그림 그리기 대상'을 표현
 */
public interface Drawable {
    public abstract void draw(int x, int y);
    public abstract void setColor(Color color);
}
