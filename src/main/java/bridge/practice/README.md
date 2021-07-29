# 연습문제 ⚾

## 9-1
### 이 장의 예제 프로그램에 클래스를 추가해서 '랜덤횟수를 표시한다'라는 처리를 실현해보십시오
<br>


## 9-1 Solution
### 기능의 클래스 확장
#### CountDisplay를 상속받아 RamdomDisplay.java 에 randomDisplay() 구현 
```java
public void randomDisplay(int times) {
    int count = (int) (Math.random() * times);
    multiDisplay(count);
}
```

<br>

## 9-2
### 이 장의 예제 프로그램에 클래스를 추가해서 '텍스트 파일의 내용을 표시한다'라는 처리를 실현해 보십시오. 이때 어느 클래스를 확장하는지를 확인해 보십시오

<br>


## 9-2 Solution
### [FileDisplayImpl 코드 확인](https://github.com/KOO-YS/java-design-pattern/tree/master/src/main/java/bridge/practice/FileDisplayImpl.java)
<br>


## 9-3
### (p.176 참고 그림)과 같은 모양을 표시하는 클래스를 이 장의 예제 프로그램에 추가한다고 가정합니다. 
### 이 모양들은 `시작 문자` -> `장식 문자가 여러번` -> `마지막 문자와 행 바꾸기` 를 1행으로 해서 이것이 여러 행 반복되고 있습니다. 반복할 떄마다 점점 장식 문자의 개수가 증가합니다.이같은 동작을 하는 클래스를 예제 프로그램에 추가하려고 할 때, 기능의 클래스 계층 or 구현의 클래스 계층 중 어디에 넣어야 할까요? 어떻게 하면 Bridge 패턴을 적용할 수 있는지 생각해보세요 
<br>


## 9-3 Solution
