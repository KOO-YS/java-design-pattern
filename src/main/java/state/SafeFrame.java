package state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);        // 현재 시간 표시
    private TextArea textScreen = new TextArea(10, 60);     // 경비센터 출력
    private Button buttonUse = new Button("Safe use");
    private Button buttonAlarm = new Button("Alarm bell");
    private Button buttonPhone = new Button("normal Call");
    private Button buttonExit = new Button("exit");
    
    private State state = DayState.getInstance();       // 현재의 상태

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 패널에 버튼을 저장
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 패널을 배치
        add(panel, BorderLayout.SOUTH);
        // 표시
        pack();
//        show();
        setVisible(true);
        // listener의 설정
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone){
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else System.out.println("?");
    }

    // 시간 설정
    @Override
    public void setClock(int hour) {
        String clockString = "현재 시간은";
        if (hour < 10) {
            clockString += "0"+hour+":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    // 상태 전환
    @Override
    public void changeState(State state) {
        System.out.println(this.state +"에서"+state+"로 상태가 변화했습니다.");
        this.state = state;
    }

    // 경비센터의 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call ! "+msg+"\n");
    }

    // 경비센터의 기록
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... "+msg+"\n");
    }
}
