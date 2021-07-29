package strategy;

/**
 * 가위바위보를 하는 사람을 표현한 클래스
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    // 이름과 전략을 할당받는다
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public HAND nextHand() {
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }
    public void even() {gameCount++;}

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", gameCount=" + gameCount +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                '}';
    }
}
