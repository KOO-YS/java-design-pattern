package mediator;

/**
 * 중개인에게 상담을 의뢰하는 회원
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);            // 중개인 명시
    /**
     * 중개인이 내리는 지시
     * @param enabled true면 자기자신을 유효상태로 만들고, false면 자기자신을 무효상태로 만든다 -> 메소드는 중개인의 판단에 따른다
     */
    public abstract void setColleagueEnabled(boolean enabled);
}
