# Abstract Factory 패턴 📚 - 관련 부품을 조합해서 제품 만들기

### Abstract Factory
- '추상적인 공장'에서 '추상적인 부품'을 조합해서 '추상적인 제품'을 만든다
- 구체적으로 어떻게 구현되고 있는지에 대해서는 생각하지 않고, 인터페이스(API)만 생각하는 상태
- 부품의 구체적인 구현에는 주목하지 않고 인터페이스(API)에 주목. 인터페이스(API)만을 사용해서 부품을 조립하고 제품으로 완성
---


#### 예제



--- 
### Abstract Factory 패턴의 등장인물
- AbstractProduct(추상적인 제품)의 역할
  - `AbstractFactory` 역할에 의해 만들어지는 추상적인 **부품** or **제품**
- AbstractFactory(추상적인 공장)의 역할
  - `AbstractProduct` 역할의 **인스턴스**를 생성하는 인터페이스(API)
- Client(의뢰자)의 역할
  - `AbstractFactory` + `AbstractProduct` 의 인터페이스(API)만을 사용해서 주어진 역할 실행
- ConcreteProduct(구체적인 제품)의 역할
  - `AbstractProduct` 역할의 인터페이스(API)를 구체적으로 구현
- ConcreteFactory(구체적인 공장)의 역할
  - `AbstractFactory` 역할의 인터페이스(API)를 구체적으로 구현
  
---
# 📌 Check

---

### COMPARE! 공장의 추가
#### 구체적인 공장을 새로 추가하는 것은 간단하다
- '간단'하다라는 것은 어떤 클래스를 만들고, 어떤 메소드를 구현하면 좋은지가 확실
  - 추상 클래스에 맞춰서 구현하면 되니까
  - factory 패키지의 클래스가 가지고 있는 추상적인 부분을 구체화해간다
#### 부품을 새로 추가하는 것은 곤란하다
- Abstract Factory 패턴에 새로 부품을 추가하게 된다면 대응하는 공장에 부품을 모두 수정해야한다
