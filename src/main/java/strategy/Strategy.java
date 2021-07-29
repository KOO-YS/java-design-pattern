package strategy;

/**
 * 가위바위보의 전략을 위한 추상 메소드의 집합
 */
public interface Strategy {
    public abstract HAND nextHand();            // 다음에 내는 손을 얻기
    public abstract void study(boolean win);    // 직전에 낸 손으로 이겼는지, 졌는지 승패 결과
}
