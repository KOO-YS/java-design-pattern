# 연습문제 ⚾

## 14-1
### 윈도우 시스템에서는 Chain of Responsibility 패턴이 자주 사용된다. 윈도우 상 컴포넌트{버튼, 텍스트 박스, 체크 박스 등}가 탑재되어 있습니다. 마우스를 클릭할 때 생기는 이벤트는 어떻게 넘겨질까요?
### Chain of Responsibility 패턴에서 next(떠넘기기 할 곳)는 어디에 등장합니까?



<br>


## 14-1 Solution

<br>



## 14-2
### 또 윈도우 시스템에 사용되는 Chain of Responsibility 패턴 문제 ... (이미지 설명 생략)


<br>


## 14-2 Solution

<br>




## 14-3
### 예제 프로그램의 Support 클래스에서 support 메소드는 public 으로 되어 있지만, resolve 메소드는 protected로 되어 있습니다. 이렇게 구분한 설계자의 의도는 무엇입니까?

<br>


## 14-3 Solution
### resolve 메소드를 public으로 선언한다면, 해당 resolve를 가지고 있는 Support 이외에도 다른 객체들이 resolve를 불러낼 수 있기 때문

<br>




## 14-4
### 예제 프로그램의 support 메소드를 재귀적으로 호출하지 말고 루프로 전개해보십시오


<br>


## 14-4 Solution
### in Support.java
```java
public final void support(Trouble trouble) {    // 트러블 해결의 수순
    for (Support s = this; ; s = s.next) {
        if(s.resolve(trouble)) {
            s.done(trouble);
            break;
        // next가 null일 때까지 반속
        } else if(s.next == null) {
            s.fail(trouble);
            break;
        }
    }
}
```
<br>