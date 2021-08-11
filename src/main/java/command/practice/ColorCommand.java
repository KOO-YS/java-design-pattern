package command.practice;

import command.Command;
import command.Drawable;

import java.awt.*;

/**
 * 그림그리기 색 설정
 */
public class ColorCommand implements Command {
    // 그림그리기 대상
    protected Drawable drawable;
    // 그림 그리기 색
    private Color color;

    public ColorCommand(Drawable drawable, Color color) {
        System.out.println(color.toString());
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
