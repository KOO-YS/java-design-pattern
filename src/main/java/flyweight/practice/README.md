# 연습문제 ⚾

## 20-1
### 예제 프로그램의 BigString 클래스에 다음과 같은 생성자를 추가하자
```java
BigString(String string, Boolean shared)
// if shared == true -> BigChar 공유 O
// if shared == false -> 공유 X 
``` 
<br>


## 20-1 Solution
### 

<br>

## 20-2
### 20-1에서 수정한 BigString 클래스를 사용해서 BigChar의 인스턴스를 공유한 경우와 공유하지 않는 경우의 메모리 소비량을 비교하십시오

<br>


## 20-2 Solution
### [소비량 비교](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/flyweight/practice/execute/Main.java)


<br>

## 20-3
### 예제 프로그램의 BigCharFactory 클래스에서는 getBigChar 메소드가 synchronized 메소드로 되어 있습니다. synchronized 메소드로 하지 않으면 어떤 문제가 발생합니까?

<br>


## 20-3 Solution
### 멀티 쓰레드가 접근하다보니 동기화되지 않는다면, 여러 쓰레드가 메소드에 동시에 접근해 같은 인스턴스를 여러 개 생성하게 될 수도 있기 때문 

<br>
