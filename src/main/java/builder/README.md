# Builder 패턴 📚 - 복잡한 인스턴스 조립하기

### Builder
- 복잡한 건물을 세울 때 한 번에 완성시키기는 어렵다
- 우선 전체를 구성하고 각 부분을 만들고 단계를 밟아 만들어 나감
- **구조를 가진 인스턴스를 쌓아 올리는 패턴**

---


#### 예제



--- 
### Builder 패턴의 등장인물
- Builder(건축자)의 역할
  - 인스턴스를 생성하기 위한 인터페이스(API)를 결정
  - Builder 역할에는 인스턴스의 각 부분을 만들기 위한 메소드 준비
- ConcreteBuilder(구체적인 건축자)의 역할
  - Builder 역할의 인터페이스를 **구현하는 클래스**
  - 실제의 인스턴스 작성으로 호출되는 메소드와 최종적인 결과를 얻기 위한 메소드 준비
- Director(감독자)의 역할
  - Builder 역할의 인터페이스(API)를 사용해서 인스턴스를 생성
  - **ConcreteBuilder 역할에 의존한 프로그래밍은 수행하지 않는다**
    - 코드의 Director도 Text&HTMLBuilder(ConcreteBuilder)가 아닌 Builder를 사용했다 💦
- Client(의뢰인)의 역할
  - Builder 패턴을 이용하는 역할



---
# 📌 Check
---

### TIP! 누가 무엇을 알고 있을까?
> #### 어떤 클래스가 어떤 메소드를 사용할 수 있을까?
[Main 클래스](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/builder/practice/execute/Main.java) 를 보면 Main 클래스는 Builder 클래스를 알지 못한다.
오직 Director 클래스의 construct 메소드만을 호출 -> Director 클래스 내부에서 일이 진행되고 문서가 완성된다
- Main은 Director만 알고있다
- Director는 Builder만 알고 있다 (Text, HTML Builder 모름)
#### 각 하위 클래스를 모르는 것이 이상적인 구조! 교환 가능성 ⬆
구체적인 하위 클래스를 '모르기 때문에' 교환이 가능하고, 교체가 가능하며 부품으로서 가치가 올라간다
