package interperter.language;

/**
 * 기본 커맨드를 생성하는 인터페이스
 */
public interface ExecutorFactory {
    public abstract Executor createExecutor(String name);
}
