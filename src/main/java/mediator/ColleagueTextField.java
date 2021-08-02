package mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener,Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void textValueChanged(TextEvent e) {     // 문자열이 변하면 Mediator에게 통지
        mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        // 유효 : 흰색 & 무효 : 밝은회색
        setBackground(enabled? Color.white : Color.lightGray);
    }
}
