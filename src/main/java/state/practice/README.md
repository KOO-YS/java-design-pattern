# 연습문제 ⚾

## 19-1
### Context를 인터페이스가 아닌 추상 클래스로 표현하고 state 필드를 Context 클래스로 표현하는 편이 패턴의 취지에 맞을텐데, 예제 프로그램에서는 Context 역할을 인터페이스로 표현하고 state 필드는 SafeFrame에서 표현한 이유는 무엇입나까?
<br>


## 19-1 Solution
### SafeFrame은 Frame을 상속받고 있다. 만약 Context가 인터페이스가 아닌 추상 클래스로 표현이 되었다면, 지금처럼 Frame을 상속받고 Actionistner, Context를 구현하는 구조가 어려웠을 것이다.

<br>

## 19-2
### 예제 프로그램에서 주간과 야간의 시간 범위를 다음과 같이 변경한다고 합시다. 소스 프로그램 중 어디를 수정해야 합니까? (355p 참고 표 확인)
<br>


## 19-2 Solution
### 각 concreteState 내부의 시간을 조정(하거나 메소드화하여 적용)
#### in DayState
```java
public void doClock(Context context, int hour) {        // 시간 설정
    if (hour < 8 || 21 <= hour) {
        context.changeState(NightState.getInstance());
    }
}
```

#### NightState
```java
public void doClock(Context context, int hour) {
    if (hour >= 8 && 21 > hour) {
        context.changeState(DayState.getInstance());
    }
}
```

<br>

## 19-3
### 예제 프로그램에 '점심시간'을 추가해서  다음과 같이 새로운 상태를 추가해 주십시오
- 점심시간일 때, 금고를 사용하면 경비센터에 비상사태가 통보된다
- 점심시간일 때, 비상벨을 사용하면 경비센터에 비상벨이 통보된다
- 점심시간일 떄, 전화를 사용하면 경비센터의 자동응답기가 호출된다
<br>


## 19-3 Solution
### [LunchState 코드 보기](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/state/practice/LunchState.java)


<br>

## 19-4
### 예제 프로그램에 '비상사태'라는 다음과 같은 새로운 상태를 추가해 주십시오. 이렇게 하면 비상시간에는 시간 상관없이 경비센터에 연락할 수 있다.
### 단, 이 사양에는 문제가 있습니다. 무엇일까요?
<br>


## 19-4 Solution
### [EmergencyState 코드 보기](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/state/practice/EmergencyState.java)
### 비상벨을 누르면 비상사태로 변할 수 있다. 하지만 비상사태에서 평소로 전환할 조건이 없다

<br>
