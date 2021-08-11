package command.execute;

import command.*;
import command.practice.ColorCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    // 그림 그린 이력
    private MacroCommand history = new MacroCommand();
    // 그림 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 제거 버튼
    private JButton clearButton = new JButton("clear");
    private JButton undoButton = new JButton("Undo");
    private JButton redButton = new JButton("RED");
    private JButton blueButton = new JButton("BLUE");

    // 생성자
    public Main(String title) throws HeadlessException {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // 연습문제 22-3
        // 자바 익명 함수 교체
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Dragged : ["+e.getPoint().x+", "+e.getPoint().y+"]");
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        undoButton.addActionListener((e) -> {
            if (e.getSource() == undoButton) {
                history.undo();
                canvas.repaint();
            }
        });
        redButton.addActionListener((e) -> {
            if (e.getSource() == redButton) {
                System.out.println("rred");
                Command cmd = new ColorCommand(canvas, Color.red);
                history.append(cmd);
                cmd.execute();
            }
        });
        blueButton.addActionListener((e) -> {
            if (e.getSource() == blueButton) {
                System.out.println("bblue");
                Command cmd = new ColorCommand(canvas, Color.blue);
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener((e) -> {
            if (e.getSource() == clearButton) {
                history.clear();
                canvas.repaint();
            }
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(redButton);
        buttonBox.add(blueButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
