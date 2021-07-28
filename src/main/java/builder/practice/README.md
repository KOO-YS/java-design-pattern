# 연습문제 ⚾

## 7-1
### 예제 프로그램의 Builder 클래스를 인터페이스로 변경하고 그것에 맞게 다른 클래스를 수정하십시오

<br>


## 7-1 Solution
- Builder 인터페이스로 변경
    ```java
    public interface Builder { ... }
    ```
- 하위 클래스들 변경
    ```java
    public class HTMLBuilder implements Builder { ... }
    ```

    ```java
    public class TextBuilder implements Builder { ... }
    ```

<br>

## 7-2 
### 예제 프로그램의 HTMLBuilder 클래스에서는 makeTitle 메소드를 처음에 호출해야 하지만, TextBuilder 클래스에서는 메소드를 호출할 때는 순서의 제한이 없습니다.
### Builder 클래스, TextBuilder 클래스, HTMLBuilder 클래스를 수정해서 makeString 메소드, makeItems 메소드, close 메소드가 호출되기 전에 한번만 makeTitle 메소드가 호출되도록 해보십시오 

<br>


## 7-2 Solution

<br>

## 7-3
### 예제 프로그램의 Builder 클래스의 하위 클래스로 ConcreteBuilder 역할을 하는 클래스를 작성하십시오. 일반 텍스트, HTML 파일을 제외하고 소재는 자유입니다.


<br>


## 7-3 Solution

<br>

## 7-4
### TextBuilder 클래스에서 문서를 구축하는 필드 buffer가 string 클래스가 아니고 StringBuffer 클래스로 되어있는 이유는 무엇입니까? String을 사용하면 안되는 이유는 무엇입니까? 

<br>


## 7-4 Solution
### String 클래스는 초기화하는 동시에 수정이 불가능해진다. 그러므로 String을 합치면 합칠수록 그만큼의 인스턴스가 추가로 생기는 것이니 메모리를 낭비하며 효율이 떨어진다. 많은 양의 문자열 추가/변경을 해야하는 경우가 있다면 StringBuffer가 적합하다
<br>