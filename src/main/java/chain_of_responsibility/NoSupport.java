package chain_of_responsibility;

/**
 * resolve 메소드는 항상 false를 반환
 * -> 자신은 아무것도 문제를 처리하지 않는 클래스
 */
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {        // 해결용 메소드
        return false;
    }
}
