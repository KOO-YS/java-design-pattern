# 연습문제 ⚾

## 4-1
### 예제 프로그램에서는 IDCard 클래스의 생성자가 public이 아닙니다. 이것은 무엇을 나타내고 있습니까?

<br>


## 4-1 Solution
```java
IDCard test = new IDCard(); 
```
### main 함수에서 직접 IDCard 객체를 생성할려고 시도해도 생성되지 않는다. public이 아닌 default 접근 제한자를 사용했기 때문에 다른 클래스에서 접근이 불가능하다
<br>

## 4-2
### 예제 프로그램의 IDCard 클래스에 카드의 인증번호를 붙이고, IDCardFactory 클래스가 인증번호와 소지자의 대응표를 갖도록 수정해 보십시오

<br>


## 4-2 Solution
### IDCard, IDCardFactory 클래스 소스 수정 참고 
```java
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();
    private int idx = 0;        // 0부터 시작
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, idx++);    // 인증번호 추가
    }
    ...
```
<br>

## 4-3
### Product 클래스의 하위 클래스에서는 생성자에서 반드시 '제품의 이름'을 인수로 부여하도록 다음과 같이 Product 클래스를 정의했습니다. 그러나 컴파일할 때 에러가 발생했습니다. 이유가 무엇입니까?
```java
public abstract class Product {
    public abstract Product(String name);
    public abstract void use();
}
```

<br>


## 4-3 Solution
### 생성자에는 abstract를 붙일 수 없다. java에서 생성자는 상속되지 않기 때문에 제품의 이름을 반드시 부여할려면, 메소드를 별도로 선언해야 한다
#### [stack overflow](https://stackoverflow.com/questions/27800229/java-abstract-class-abstract-constructor)
