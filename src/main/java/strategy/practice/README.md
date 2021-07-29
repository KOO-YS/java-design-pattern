# 연습문제 ⚾

## 10-1 
### 순서 없이 다음의 손을 내는 RandomStrategy 클래스를 작성하십시오
<br>


## 10-1 Solution
### [RamdomStrategy 구현](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/strategy/practice/RandomStrategy.java)
### [Main 실행 코드 확인](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/strategy/practice/Main.java)
<br>


## 10-2 
#### 이 장의 예제 프로그램 중 HAND 클래스의 fight 메소드에는 무승부 판정을 하기 위해 
```java
this.handvalue == h.handvalue
```
#### 가 아닌
```java
this == h
```
#### 라는 식을 사용하고 있습니다. 왜 이 식으로 해도 문제가 발생하지 않을까요?

<br>


## 10-2 Solution
##### * 예시와 실제 구현 코드가 다르기에 책 기준으로 설명
#### Hand의 인스턴스를 가져올 때마다 생성하는 것이 아닌, `static final`로 선언되어 미리 생성된 배열에서 매번 같은 인스턴스를 들고온다
#### 그렇기 때문에 만약 (가위바위보의 값이 같다)면 배열에서 같은 인스턴스를 들고와 (주소값이 같다)로 결론이 나서, `this == h`라 하더라도 동일성이 보장될 수 밖에 없다

<br>


## 10-3
#### 어떤 사람이 WinningStrategy 클래스를 프로그래밍할 경우 won 필드를
```java
private Boolean won = false;
```
#### 가 아니고
```java
private Boolean won;
```
#### 이라고 기술했습니다. 그러나 = false를 기술할 때와 같은 동작을 했습니다. 왜 그럴까요?

<br>


## 10-3 Solution
### Boolean은 선언했을 당시 초기화하지 않으면 default 값 false으로 자동 초기화 된다. 추가로 `= false`를 적어주지 않아도  `false` 값이 세팅되었다
<br>

## 10-4
### (p.192 리스트)의 프로그램은 정렬을 실행하기 위한 클래스와 인터페이스입니다. 현재 알고리즘으로 선택정렬을 이용하고 있지만, 다른 알고리즘을 표현하는 클래스를 Sorter의 인터페이스에 맞춰서 작성하십시오

<br>


## 10-4 Solution
### [코드로 확인](https://github.com/KOO-YS/java-design-pattern/tree/master/src/main/java/strategy/practice/sorter)
<br>
