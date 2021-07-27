# Factory Method 패턴 📚 - 하위 클래스에서 인스턴스 작성하기

### Factory Method
- Template Method 패턴에서는 상위 클래스에서 처리의 골격을 만들고, 하위 클래스에서 구체적으로 처리하는 방식을 **인스턴스 생성의 장면에서 적용**
    - Template Method + 인스턴스 생성 공장 = Factory Method
- 인스턴스 만드는 방법을 상위 클래스 측에서 결정하지만 구체적인 클래스 이름까지는 결정하지 않는다
    - 인스턴스 생성을 위한 골격 / 인스턴스 생성 클래스 분리



---


#### 예제



--- 
### Factory Method 패턴의 등장인물
- Product(제품)의 역할
  - framework 쪽에 포함
  - 생성되는 인스턴스가 가져야할 인터페이스(API) 결정
- Creator(작성자)의 역할
  - framework 쪽에 포함
  - 실제로 생성하는 역할(하위클래스)에 대해 가지고 있는 정보가 없다
  - new를 사용해서 실제 인스턴스를 생성하는 대신, 인스턴스 생성을 위한 메소드를 호출하며 클래스 이름 명명에서 자유롭다
- ConcreteProduct(구체적인 제품)의 역할
  - 구체적인 제품을 결정
- ConcreteCreator(구체적인 작성자)의 역할
  - 구체적인 제품을 만드는 클래스를 결정
---
# 📌 Check

---
 
### TIP! framework와 구체적인 내용
- 동일한 framework를 사용해서 전혀 다른 '제품'과 '공장'을 만들 수 있다
- IDCard나 TV같이 특정 제품과 공장들은 `framework` 패키지를 import한다
- framework 패키지 내용을 따로 수정하지 않아도 전혀 관련없는 제품들을 일관성있게 만들 수 있다
> framework 패키지는 idcard 패킼지에 의존하고 있지 않다

<br>


### TIP! 인스턴스 생성 - 메소드 구현 방법
예제 프로그램의 Factory 클래스의 createProduct 메소드는 추상 메소드이며 하위 클래스에서 구현해야 한다
**createProduct 메소드 기술 방법 3가지**
- 추상 메소드
  - 하위 클래스에서 반드시 이 메소드를 구현해야 한다
  ```java
  abstract class Factory { public abstract Product createProduct(String name); }
  ```
- 디폴트로 구현 준비
  - 디폴트의 구현을 준비해두고, 만약 하위 클래스가 구현하지 않았을 때 사용
  - Product 클래스에 대해 직접 new 생성자를 사용해서 Product를 추상 클래스로 둘 수 없다
  ```java
  class Factory { 
    public Product createProduct(String name) {
        return new Product(name);
    }
  }
  ```  
- 에러 이용
  - 디폴트 구현을 에러로 처리해 두면, 하위 클래스에서 구현하지 않았을 경우에는 실행할 때 에러가 발생
  ```java
  class Factory {
    public Product createProduct(String name) {
      throw new FactoryMethodRuntimeException();    // custom
    }
  }
  ```