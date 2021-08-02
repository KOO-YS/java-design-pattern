package mediator;

/**
 * 중개인 역할
 * 다수의 오브젝트 사이를 조정해야 할 경우 사용
 */
public interface Mediator {
    public abstract void createColleagues();
    public abstract void colleagueChanged();
}
