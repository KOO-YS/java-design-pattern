package state;

/**
 * 금고의 상태 -> 상태에 대응해서 처리가 변하는, 즉, 상태 의존 메소드의 집합
 */
public interface State {
    // 시간이 설정되었을 때
    public abstract void doCheck(Context context, int hour);
    // 금고가 사용되었을 때
    public abstract void doUse(Context context);
    // 비상벨이 눌렸을 때
    public abstract void doAlarm(Context context);
    // 일반 통화를 할 때
    public abstract void doPhone(Context context);
}
