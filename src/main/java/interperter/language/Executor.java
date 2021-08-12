package interperter.language;

/**
 * 실행을 표현하는 인터페이스
 */
public interface Executor {
    public abstract void execute() throws ExecuteException;
}
