# 연습문제 ⚾

## 3-1
### java.io.InputStream 클래스에서는 Template Method 패턴이 사용되고 있습니다. API 레퍼런스를 읽고 `java.io.InputStream`의 하위 클래스에서 구현할 메소드는 무엇인지 조사하십시오

<br>

## 3-1 Solution
### read() 메소드
![image](https://user-images.githubusercontent.com/46165696/127027978-c63cb9cf-ec9f-4670-bfdf-fc3682d90b35.png)

![image](https://user-images.githubusercontent.com/46165696/127027903-4d987346-a219-47b0-9e9e-aa0bd7b7de64.png)
```text
public abstract int read() throws IOException
Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
A subclass must provide an implementation of this method.

Returns:
the next byte of data, or -1 if the end of the stream is reached.
Throws:
IOException - if an I/O error occurs.
```
- byte[] 배열과 배열의 시작 인덱스, 읽는 데이터 길이 등을 통해 데이터를 읽을 수 있도록 구현한다 


---
<br>

## 3-2
### 예제 프로그램의 AbstractDisplay 클래스의 display 메소드는 
```java
public final void display () {}
```
### 으로 구현되어 있습니다. 여기에서 final은 무엇을 나타내고 있습니까?

<br>

## 3-2 Solution
### 상속받을 하위 클래스들이 display 메소드를 오버라이딩 재정의하지 못하게 막는 역할 


---
<br>

## 3-3
### 예제 프로그램에서 open, print, close 메소드를 상속관계 및 동일 패키지에 있는 클래스에서만 호출할 수 있도록 하고, 관계 없는 다른 클래스에서는 호출하지 않도록 합니다. 어떻게 하면 될까요?

<br>

## 3-3 Solution
### 동일 패키지 안에서만 접근할 수 있도록 protected 접근 제한자 사용

---
<br>

## 3-4
### Java의 인터페이스는 추상 클래스와 매우 비슷합니다. 인터페이스도 추상 메소드의 집합이지만, Template Method 패턴에서는 AbstractClass 역할에 인터페이스를 사용할 수 없습니다. 왜 그럴까요?

<br>

## 3-4 Solution
### AbstractClass은 display() 메소드에 템플릿 메소드 패턴을 적용하여 알고리즘 로직을 구현해 놓았다. 하지만 AbstractClass를 인터페이스로 적용한다면 display()을 추상 메소드로 만들며, 관련된 로직을 구현 메소드들이 각각 구현해야 하기 때문에 템플릿처럼 동작할 수 없다.