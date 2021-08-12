# Interpreter 패턴 📚 - 문법규칙을 클래스로 표현하기

### Interpreter
- 프로그램이 해결하려는 문제를 간단한 '미니 언어'로 표현합니다. 구체적인 문제를 미니 언어로 기술된 '미니 프로그램'으로 표현합니다
    - 미니 프로그램은 그 자체만으로 동작하지 않기 때문에 Java 언어로 통역(interpreter) 역할을 하는 프로그램을 만들어 둡니다
    - 통역 프로그램(interpreter) -> 미니 언어를 해석하고 미니 프로그램을 해석, 실행합니다
- 

---

#### 예제



--- 
### Interpreter 패턴의 등장인물
- AbstractExpression(추상적인 표현)의 역할
  - 구문 트리의 노드에 공통의 인터페이스(API)를 결정하는 역할
- TerminalExpression(종착점 표현)의 역할
  - 예제 프로그램의 PrimitiveCommandNode 처럼 더이상 루프를 들어가지 않는 역할
- NonterminalExpression(비종착점 표현)의 역할
  - 예제 프로그램의 ProgramNode, CommandNode, RepeatCommandNode, CommandListNode처럼 재귀적인 역할
- Context(문맥, 전후관계)의 역할
  - 인터프리터가 구문해석을 실행하기 위한 정보를 제공하는 역할
- Client(의뢰자)의 역할
  - 구문트리를 조립하기 위해서 TerminalExpression & NonterminalExpression을 호출하는 역할

---
# 📌 Check

---

### MORE! 그 외의 미니 언어 
- 정규 표현 (regular expression)
- 검색용의 표현
  - `ex` 단어의 조합 설명
- 일괄(batch) 처리 언어
  - 기본적인 명령이 몇 가지 준비되어 있고 그것들을 순서대로/반복해서 실행하는 언어
