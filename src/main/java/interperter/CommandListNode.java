package interperter;

import java.text.ParseException;
import java.util.ArrayList;

// <command list> ::= <command>*end
public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();
    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {       // 마지막까지 읽음
                throw new ParseException("Missing 'end'", 0);
            } else if (context.currentToken().equals("end")) {  // 이번 차례 토큰이 end -> 마지막
                context.skipToken("end");
            } else {        // <command>
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
