# Visitor 패턴 📚 - 데이터 구조를 돌라다니면서 처리하기

### Visitor
- 데이터 구조와 처리를 분리
- 데이터 구조 안에 많은 요소가 저장되어 있고, 각 요소에 대해 필요한 처리 담당
- 데이터 구조를 돌면서 '방문자'를 나타내는 클래스를 준비해 처리 위임

---


#### 예제



---
### Visitor 패턴의 등장인물
- Visitor(방문자)의 역할
  - 데이터 구조의 구체적인 요소마다 'xxx을 방문했다'라는 visit(xxx) 메소드를 선언
  - visit(xxx)는 xxx를 처리하기 위한 메소드이고, 실제 코드는 ConcreteVisitor에 기술
- ConcreteVisitor(구체적인 방문자)의 역할
  - Visitor 역할의 인터페이스(API)를 구현
  - visit(xxx) 메소드를 구현하고, 각각의 ConcreteElement 역할의 처리를 기술
- Element(요소)의 역할
  - Visitor 역할의 방문할 곳을 나타내는 역할
  - 방문자를 받아들이는 accept 메소드 선언 -> parameter로 Visitor 역할이 전달
- ConcreteElement(구체적 요소)의 역할
  - Element 역할의 인터페이스(API)를 구현하는 역할
- ObjectStructure(오브젝트의 구조)의 역할
  - Element 역할의 집합을 취급하는 역할
  - 예제의 Directory는 Entry 객체들을 모아두는 역할




---
# 📌 Check

---

### TIP! 더블 디스패치 (double dispatch)
더블 디스패치 -> 이중 분리

```java
element.accept(Visitor)
```

```java
visitor.visit(element)
```
이 둘은 정확히 반대의 관계이다.
- element는 visitor를 accept
- visitor는 element를 visit
  Visitor 패턴에서는 ConcreteElement 역할과 ConcreteVisitor 역할을 하는 한 쌍에 의해 실제 처리가 결정된다.
  

<br>

### WHY? 왜 복잡하게 Visitor를 활용할까?
반복 처리가 필요하면 데이터 구조 안에서 루프를 돌리면 되지, 어째서 Visitor 패턴을 사용할까?
#### Visitor 패턴의 목적
처리를 데이터 구조에서 분리하는 일
<br>

데이터 구조 : 요소를 집합으로 정리, 요소 사이 연결 등 중요한 역할을 한다
*BUT, '구조를 유지하는 것'과 '구조를 기초로 한 처리를 기술하는 것'은 별개다*

 `example`

예제 프로그램에서는 ListVisitor를 출력을 실행하는 역할이고, 다른 처리를 실행하는 또 다른 ConcreteVisitor를 만들 수 있다. 

일반적으로 ConcreteVisitor 역할은 File&Directory 클래스와 독립적으로 개발할 수 있다

File&Directory 클래스의 **부품으로써의 독립성**을 높일 수 있다

<br>



### TIP! The Open-Closed Principle (OCP)

#### 확장에 대해서는 열고 수정에 대해서는 닫는다

클래스를 설계할 때 특별한 이유가 없는 한 **확장을 허용**해야한다 -> `확장에 open`

확장을 하되 **기존의 클래스를 수정하는 것은 곤란**하다 -> `수정에 closed`

> 확장에 대해서는 열려있고 수정에 대해서는 닫혀있는 클래스가 부품으로써 재이용 가치가 높은 클래스이다 

