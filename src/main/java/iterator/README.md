# Iterator 패턴 📚 - 순서대로 지정해서 처리하기

### Iterator 
- Java 언어에서 배열 arr의 모든 요소를 표시하기 위해 for 문을 사용
    ```java
    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
    ```
  - 사용되는 루프(loop) 변수 `i`
  - 배열은 요소가 많이 모여있는 것으로, 첨자를 지정하면 많은 요소 중 1개를 선택 가능
- **Iterator** : 변수 `i`의 기능을 **추상화해서 일반화한 것** 

---
### Iterator 패턴
- 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것
- 무엇인가를 '반복한다'라는 의미로 반복자라고 칭하기도 함
---

#### 예제



--- 
### Iterator 패턴의 등장인물

- Iterator(반복자)의 역할
    - 요소를 순서대로 검색해가는 인터페이스(API) 결정
- ConcreteIterator(구체적인 반복자)의 역할
    - Iterator가 결정한 인터페이스(API)를 실제로 구현
    - 검색하기 위한 필요한 정보를 가지고 있어야 함
- Aggregate(집합체)의 역할
    - Iterator 역할을 만들어내는 인터페이스(API) 결정
    - 내가 가지고 있는 요소를 순서대로 검색해주는 역할(->iterator()을 생성
- ConcreteAggregate(구체적인 집합체)의 역할
    - Aggregate 역할이 결정한 인터페이스(API)를 실제로 구현하는 일
    - ConcreteIterator 생성
  
---
# 📌 Check

---

### Why? 왜 Iterator를 사용할까?

왜 for 문을 사용하지 않고 Iterator 역할을 생성할까❓
<br>

*Iterator를 사용함으로써 구현과 분리해서 하나씩 셀 수 있기 때문*
```java
while (it.hasNext()) {
    Book book = (Book) it.next();
    System.out.println(book.getName());
}
```
- 객체의 구현에 의존하지 않는다
  - 실제로 BookShelf의 구현에 의존하지 않았다!
- 전혀 변경하지 않아도 동작한다
  - 디자인 패턴의 재이용화 촉진
<br>

### Why? 인터페이스를 구현해야 할까?
<br>

왜 구체적인 클래스로 바로 해결하지 않을까?
<br>

구체적인 클래스만 사용하면 클래스 간의 결합이 강해져서, 부품으로 재이용하는 일이 어렵다
**결합을 약하게** 해서 부품으로 **재이용**하기 쉽도록 `추상 클래스` or `인터페이스` 도입이 필요

> #### 추상 클래스나 인터페이스를 사용해 프로그래밍을 한다는 사고방식이 중요 🔑
 

<br>

### Caution! `next`와 `hasNext`
`next`와 `hasNext`는 현재와 다음 중 어떤 요소를 반환할까?
- **next**
  ```java
  returnCurrentElementAndAdvanceToNextPosition
  ```
  - 현재 요소 반환
  - 다음 위치로 진행
  
- **hasNext**
  - 다음에 `next` 메소드를 불러도 괜찮은지 **확인**
<br>
    
### Tip! Iterator의 다양한 종류
- 이번 예제의 Iterator 클래스는 정방향으로 한번만 검색하는 단순한 형태였다
- Iterator 검색에는 다양한 종류가 있다
  - example
    - 역방향 진행
    - 정방향과 역방향 `-> previous 메소드도 가진다`
    - 번호를 지정해서 지정 검색
<br>
    
### Tip! Iterator 객체를 삭제해야할까?
- Java에서는 사용되지 않는 인스턴스는 가비지 컬렉터에 의해 자동으로 삭제된다
- 개별적으로 삭제할 필요는 없다
