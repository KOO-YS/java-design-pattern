# 연습문제 ⚾

## 22-1
### 예제 프로그램에 '그림그리기 색을 설정'하는 기능을 추가. 이것은 마치 그림 붓을 교체하는 것과 마찬가지로 새로운 색을 설정한 후 마우스를 드래그하면 새로운 색으로 점이 그려집니다. 

<br>


## 22-1 Solution
### [Main 실행 코드 확인](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/command/practice/ColorCommand.java)
### 

<br>

## 22-2
### 예제 프로그램에 '마지막으로 그린 점을 삭제한다'라는 undo 기능을 추가

<br>


## 22-2 Solution
### [Main 실행 코드 확인](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/command/execute/Main.java)
````java
undoButton.addActionListener((e) -> {
    if (e.getSource() == undoButton) {
        history.undo();
        canvas.repaint();
    }
});
````
<br>

## 22-3
### MouseMotionListener 인터페이스와 WindowListener 인터페이스를 사용하는 대신에 MouseMotionAdapter 클래스와 WindowAdapter 클래스를 사용하도록 예제 프로그램의 Main 클래스를 수정하십시오

<br>


## 22-3 Solution
### [Main 실행 코드 확인](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/command/execute/Main.java)


<br>