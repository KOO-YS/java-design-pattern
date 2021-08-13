package interpreter.language;

import java.text.ParseException;

/**
 * 구문 트리의 각 부분을 구성하는 최상위 클래스
 */
public abstract class Node implements Executor{
    // 구문 해석
    public abstract void parse(Context context) throws ParseException;
}
