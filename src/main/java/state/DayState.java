package state;

public class DayState implements State{
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {     // 유일한 인스턴스
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {        // 시간 설정
        // lunch
        if (LUNCH_START <= hour && hour < LUNCH_END) {
            context.changeState(LunchState.getInstance());
        }
        // night
        else if (hour < MORNING_START || NIGHT_START <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
        context.changeState(EmergencyState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
