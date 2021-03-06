# Template Method 패턴 📚 - 하위 클래스에서 구체적으로 처리하기

### Template Method
- 상위 클래스쪽에 템플릿에 해당하는 메소드 정의
  - 추상 메소드 정의 -> `뼈대`
- 하위 클래스쪽에서 메소드를 구현하면 구체적인 처리가 결정
  - 추상 메소드 실제 구현 -> `구체적`
- **template method의 특징**  
    - 상위 추상 메소드가 최종적으로 어떤 처리가 수행되는지 알 수 없다
    - 서로 다른 하위 클래스가 서로 다른 구현을 실행하면, 서로 다른 처리가 실행된다
    > 하위 클래스를 어떻게 구현하더라도, 큰 흐름은 상위 클래스가 결정한대로 흘러간다





---


#### 예제



--- 
### Template Method 패턴의 등장인물
- AbstractClass(추상 클래스)의 역할
  - **템플릿 메소드를 구현**하고, **템플릿 메소드에서 사용하는 추상 메소드**를 선언한다
  - 추상 메소드는 구현 클래스에 의해 구현된다
- ConcreteClass(구현 클래스)의 역할
  - 추상 메소드를 구체적으로 구현
  - 이 클래스에서 구현한 메소드는 **템플릿 메소드에서부터 호출**된다
---
# 📌 Check

---

### What? Template Method를 사용하면 얻을 수 있는 장점이 무엇인가요?
**\"로직의 공통화\"**
- 상위 클래스의 템플릿 메소드에서 알고리즘이 기술되어 있으므로 **하위 클래스측에서 로직을 일일이 기술할 필요가 없다**
- 추상 클래스 단계에서 처리의 흐름을 형성하는 것이 중요
<br>
  
### TIP! 상위 클래스와 하위 클래스의 관계
- 하위 클래스를 구현할때는 그 메소드가 상위 템플릿 메소드의 **어느 타이밍에 호출되는지 이해**해야 한다 
- 하위 클래스를 상위 클래스와 동일시 한다
  > 상위 클래스가 `과일`, <br>
  > 하위 클래스가 `사과`, `바나나`, `오렌지` 등 일 때, <br>
  > 상위 클래스에 어떤 하위 클래스 인스턴스를 대입하더라도 동일하게 작동해야 한다
  > `instanceof` **등 종류를 구분짓는 방식은 적합하지 않다!**
<br>
  

---

## ➕  Addtional Info

### subclass responsibility (하위 클래스의 책임)
- 하위 클래스의 시점에서 클래스 계층을 보는 경향
  - 상위 클래스에 정의되어 있는 메소드를 하위 클래스에서 사용할 수 있다
  - 하위 클래스에 추가 기능을 구현할 수 있다
  - 하위 클래스에서 메소드를 오버라이드해서 변경할 수 있다
- 상위 클래스에서 클래스 계층을 보는 경향
  - 하위 클래스에서 메소드가 구현되길 기대한다
  - 하위 클래스에 대해서 그 메소드를 구현하길 요청한다

➡️*하위 클래스는 상위 클래스에서 선언된 추상 메소드를 구현할 책임이 생겼다*

  
