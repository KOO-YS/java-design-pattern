package state;

public class NightState implements State{
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {     // 유일한 인스턴스
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // lunch
        if (LUNCH_START <= hour && hour < LUNCH_END) {
            context.changeState(LunchState.getInstance());
        }
        // day
        else if (hour >= MORNING_START && NIGHT_START > hour) {
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
        context.changeState(EmergencyState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("야간통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }
}
