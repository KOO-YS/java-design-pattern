# 연습문제 ⚾

## 18-1
### Caretaker 역할은 좁은 인터페이스(API)를 통해서 밖에 Memento 역할을 조작할 수 없다. 만약 Caretaker 역할이 Memento 역할을 자유롭게 조작할 수 있으면 어떤 불편이 있습니까?

<br>


## 18-1 Solution
### Memento 역할이 밖에서도 조작이 된다고 하면, 그 변경의 영향이 Originator에게 갈 수 밖에 없다. 

<br>


## 18-2
### 예제 프로그램에서는 소지금과 과일만이 상태를 결정하는 것이었습니다. 그러나 저장해야 할 정보가 대량인 경우는 Memento의 인스턴스를 저장하기 위해서 대용량의 메모리 공간이나 디스크 공간이 필요합니다. 이것에 대해 대처할 방법은?

<br>


## 18-2 Solution
### 
<br>



## 18-3
### Memento 클래스에 새로운 필드 `number(int)`를 추가해서 다음과 같이 액세스 제어를 하려고 합니다. 어떻게 하면 실현할 수 있습니까?
- Memento 클래스는 number의 값을 얻는 수도, 변경할 수도 있다
- Gamer 클래스는 number의 값을 얻을 수 있지만 변경할 수는 없다
- Main 클래스는 number의 값을 얻을 수도, 변경할 수도 없다

<br>


## 18-3 Solution
### Memento, Gamer 클래스가 같은 패키지 내에 있다는 점을 이용
#### Memento에는 number 필드와 메소드 선언
```java
public class Memento {
    ...
    private int number;

    int getNumber() {
        return number;
    }
}
```
#### Gamer에서는 Memento의 number 값을 받아올 수 있다
```java
void showNumber(Memento m) {
    m.getNumber();      // 같은 패키지 안에 있는 Gamer 클래스는 Mememto의 number 값을 얻을 수 있다
}
```
#### Main에서는 전혀 가져올 수 없다
```java
// memento.getNumber(); XXX 컴파일 실패
// -> Main에서는 number에 아예 접근할 수 없다
```
<br>


## 18-4
### 직렬화(serialization)의 기능을 사용하면 작성한 Memento의 인스턴스를 파일로 저장할 수 있다. 다음과 같은 기능을 만족하도록 예제 프로그램을 변경해 주십시오
1. 파일 `game.dat`가 존재하지 않을 때에는 소지금 100원부터 시작
2. 소지금이 많이 증가하면 Memento의 인스턴스를 파일 `game.dat`로 저장한다
3. 프로그램 실행 시에 파일 `game.dat`가 존재하면 그 파일에 저장되어 있는 상태에서 시작
... (추가 조건 참고)

<br>


## 18-4 Solution
### 
<br>

