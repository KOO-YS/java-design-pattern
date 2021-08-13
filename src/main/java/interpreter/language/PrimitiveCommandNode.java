package interpreter.language;

import java.text.ParseException;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
    private String name;
    private Executor executor;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
//        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
//            throw new ParseException(name+" is undefined", 0);
//        }
        executor = context.createExecutor(name);
    }

    public void execute() throws ExecuteException {
        if (executor == null) {
            throw new ExecuteException(name+": is not defined");
        } else {
            executor.execute();
        }
    }

    public String toString() {
        return name;
    }
}
