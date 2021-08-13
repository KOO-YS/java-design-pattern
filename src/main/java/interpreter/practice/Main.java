package interpreter.practice;

import interpreter.car.CarCanvas;
import interpreter.language.InterpreterFacade;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements ActionListener {
    private CarCanvas canvas = new CarCanvas(400, 400);
    private InterpreterFacade facade = new InterpreterFacade(canvas);
//    private TextField programTextField = new TextField("program repeat 3 go right go left end end");
    private TextField programTextField = new TextField("program go left left end");

    public Main(String title) {
        super(title);

        canvas.setExecutor(facade);
        setLayout(new BorderLayout());
        programTextField.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(programTextField, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        pack();
        parseAndExecute();
        setVisible(true);

    }

    private void parseAndExecute() {
        String programText = programTextField.getText();
        System.out.println("programText = "+programText);
        facade.parse(programText);
        canvas.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == programTextField) {
            parseAndExecute();
        }
    }

    public static void main(String[] args) {
        new Main("Interpreter Pattern Sample");
    }
}
