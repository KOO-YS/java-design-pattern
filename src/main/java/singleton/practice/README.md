# 연습문제 ⚾

## 5-1
### 다음 TicketMaker 클래스는 getNextTicketNumber 메소드를 호출할 때마다 1000, 1001, 1002, ... 라는 수를 순서대로 반환하기 위한 것입니다. 이 TicketMaker 클래스는 현재 상태라면 인스턴스를 몇 개라도 만들 수 있습니다. 여기에 Singleton 패턴을 적용해서 인스턴스가 하나만 만들어지도록 하십시오
```java
public class TicketMaker {
    private int ticket = 1000;
    public int getNextTicketNumber() {
        return ticket++;
    }
}
```

<br>


## 5-1 Solution

<br>

## 5-2
### 인스턴스의 개수가 3개로 한정되어 있는 클래스 Triple을 만드십시오. 인스턴스에는 0, 1, 2라는 번호가 붙어있고 getInstance(int id)에서 id번의 인스턴스가 얻어진다고 가정합니다,


<br>


## 5-2 Solution
### 
<br>

## 5-3
### 어떤 사람이 Singleton 클래스를 하단 코드와 같이 만들었습니다. 그러나 엄밀하게는 Singleton 패턴이 아닙니다. 왜 그렇습니까?  
```java
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다");
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```
<br>a

## 5-3 Solution
### 만약 getInstance()의 if문 안에 동시에 여러 스레드가 접근해버리면 Singleton 객체가 여러 개가 생겨버린다
