# Observer 패턴 📚 - 상태의 변화를 알려주기

### Observer
- 관찰 대상의 상태가 변화하면 관찰자에게 알려준다
- 상태 변화에 따른 처리를 기술할 때 효과적

---


#### 예제



--- 
### Observer 패턴의 등장인물
- Subject(관찰 대상자)의 역할
  - 관찰되는 대상 -> 예제 프로그램에서의 NumberGenerator 클래스
  - 현재 상태를 취득하는 메소드도 선언되어있다
- ConcreteSubject(구체적인 관찰 대상자)의 역할
  - 관찰되는 대상을 **표현** -> 예제 프로그램에서 RandomNumberGenerator
  - 상태가 변화하면 그것이 등록되어 있는 Observer 역할에 전함
- Observer(관찰자)의 역할
  - Subject 역할로부터 '상태가 변했습니다'라고 전달 받는 역할
  - 예제 프로그램에서는 Observer 인터페이스의 update 메소드
- ConcreteObserver(구체적인 관찰자)의 역할
  - 구체적인 Observer -> 예제 프로그램에서 DigitObserver, GraphObserver 클래스
  - update 메소드가 호출되면 그 메소드 안에서 **Subject 역할의 현재 상태 취득**
---
# 📌 Check

---

### TIP! Observer의 순서
Subject 역할에는 복수의 Observer 역할이 등록되어 있다.
일반적으로 ConcreteObserver 역할의 클래스를 설계할 경우에는 update 메소드가 호출되는 순서가 변해도 문제가 일어나지 않도록 해야 한다.
<br>
일반적으로 각 클래스의 독립성이 보장되면 의존성의 혼란은 별로 발생하지 않는다
BUT, 다음과 같은 상황에서는 주의 해야 한다.
- Observer의 행위가 Subject에 영향을 미칠 때
  - 이번 예제와 달리 일반적인 Observer 패턴에서는 Subject 역할이 다른 클래스로부터 update 메소드의 호출을 요청받는 경우도 있다.
  - `example` GUI에서 사용자가 버튼을 눌러 요청해 update를 호출하는 경우
  - 또한 Subject 역할이 상태가 변화할 때 update를 호출해 Observer에게 전달하면, Observer가 Subject의 메소드를 호출해 또다시 상태가 변화하게 되고, 무한 루프에 빠질 수 있다
    - Observer 역할이 '현재 Subject 역할로부터 전달받고 있는 중인지 아닌지'를 flag 변수로 표시하는 것도 좋다!

<br>

### TIP! '관찰'하기보다 '전달'받길 기다린다
- observer는 subject로부터 '전달'되는 것을 수동적으로 기다린다. 
- observer는 Publish-Subscribe(발행과 구독)패턴이라고도 한다


### Model/View/Controller(MVC)
MVC 안에 Model과 View의 관계는 Observer 패턴의 Subject 역할과 Observer 역할의 관계에 대응합니다. 
- Model : '표시 형식에 의존하지 않는 내부 모델'을 조작하는 부분
- View : Model이 '어떻게 보일 것인지'를 관리하고 있는 부분
일반적으로 하나의 Model에 복수의 View가 대응

<br>


---

## ➕  Addtional Info

### java.util.Observer 인터페이스

java의 클래스 라이브러리에는 Observer 패턴의 일종으로 
- java.util.Observer 인터페이스
- java.util.Observable 클래스

를 제공한다

```java
public void update(Observable obj, Object arg)
```
**@Param**
- `Observable obj` : 관찰되는 대상(Subject 역할)으로서, Observable 클래스의 인스턴스
- `Object arg` : 부가 정보로서, Object 클래스의 인스턴스
<br>
  
\*BUT, java.util.Observer 인터페이스와 java.util.Observable 클래스를 사용하기 힘들다
그 이유는 Subject 역할에는 Observable 클래스를 사용할 필요가 있지만, Java가 단일 상속을 지원하기에 다른 필요한 상속과 함께 사용할 수 없다
