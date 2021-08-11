package command;

import java.awt.*;

/**
 * Command 인터페이스를 구현한 클래스이고, 
 * '점 그리기 명령' 표현
 */
public class DrawCommand implements Command{
    // 그림 그리기 실행 대상
    protected Drawable drawable;
    // 그림 그리기 실행 위치
    private Point position;
    // 생성자 : 이 위치에 점을 그려라
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // 실행
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);      // 명령 실행
    }
}
