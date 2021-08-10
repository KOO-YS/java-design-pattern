package state;

public class LunchState implements State{
    private static LunchState singleton = new LunchState();

    private LunchState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // morning
        if((MORNING_START< hour && hour < LUNCH_START) || (LUNCH_END <= hour && hour < NIGHT_START)) context.changeState(DayState.getInstance());
        // night
        else if (hour < MORNING_START || NIGHT_START <= hour) context.changeState(NightState.getInstance());
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(점심)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점심)");
        context.changeState(EmergencyState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(점심)");
    }

    @Override
    public String toString() {
        return "[점심]";
    }
}
