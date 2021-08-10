package state;

public class EmergencyState implements State{
    private static EmergencyState singleton = new EmergencyState();

    private EmergencyState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 시간 상관 X
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상상태 호출");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨 호출");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("경비센터 호출");
    }

    @Override
    public String toString() {
        return "[비상사태]";
    }
}