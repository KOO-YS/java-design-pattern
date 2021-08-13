package interpreter.language;

import java.text.ParseException;
import java.util.StringTokenizer;

/**
 * 구문해석을 위해 필요한 메소드를 제공
 */
public class Context implements ExecutorFactory{
    private ExecutorFactory factory;
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning : "+token+" is expected, but "+currentToken+" is found", 0);
        }
        nextToken();
    }

    public int currentNumber() {
        int number = 0;
        number = Integer.parseInt(currentToken);
        return number;
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else currentToken = null;

        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void setExecutorFactory(ExecutorFactory factory) {
        this.factory = factory;
    }

    @Override
    public Executor createExecutor(String name) {
        return factory.createExecutor(name);
    }
}
