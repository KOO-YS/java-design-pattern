package state;

public class NightState implements State{
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {     // 유일한 인스턴스
        return singleton;
    }

    @Override
    public void doCheck(Context context, int hour) {
        if (hour <= 9 && 17 > hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("비상 : 야간금고 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callLog("야간통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }
}
