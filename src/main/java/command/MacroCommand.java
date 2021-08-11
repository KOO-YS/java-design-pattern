package command;

import java.util.Iterator;
import java.util.Stack;

/**
 * 복수의 명령을 모은 명령
 */
public class MacroCommand implements Command{
    // 명령의 집합
    private Stack commands = new Stack();
    // 실행
    @Override
    public void execute() {
        System.out.println("복수의 명령 실행");
        Iterator it = commands.iterator();
        // 복수의 명령 실행
        while(it.hasNext()) {
            ((Command)it.next()).execute();     // commands 필드에 저장되어 있는 각각의 인스턴스의 execute 메소드를 호출
        }
    }
    // 추가
    public void append(Command cmd) {
        if (cmd != this) {          // 자기 자신이 아닌지 검사 -> 무한 루프 위험
            commands.push(cmd);
        }
    }
    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // 전부 삭제
    public void clear() {
        commands.clear();
    }
    

}
