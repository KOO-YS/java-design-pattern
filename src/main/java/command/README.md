# Command 패턴 📚 - 명령을 클래스로 표현하기

### Command
- 명령을 표현하는 클래스
- 실행하고 싶은 일을 '메소드를 호출'하는 동적인 처리로 표현하는 것이 아니라, **명령을 나타내는 클래스의 인스턴스로 하나의 물건처럼 표현할 수 있다**
- Event라고도 부른다
    - '이벤트 구동 프로그래밍'에서 사용되는 '이벤트'와 같은 의미

---


#### 예제



--- 
### Command 패턴의 등장인물
- Command(명령)의 역할
  - 명령의 인터페이스(API)를 정의하는 역할 -> `ex` Command
- ConcreteCommand(구체적 명령)의 역할
  - Command 역할의 인터페이스(API)를 실제로 구현하고 있는 역할 -> `ex` MacroCommand, DrawCommand
- Receiver(수신자)의 역할
  - 명령을 실행할 때 대상이 되는 역할 -> `ex` DrawCanvas
- Client(의뢰자)의 역할
  - ConcreteCommand 역할을 생성하고 그 사이에 Receiver 역할을 할당 -> `ex` Main
  - 마우스의 드래그에 맞춰 DrawCommand 인스턴스를 생성, 그 사이에 Receiver 역할로 DrawCanvas 인스턴스를 생성자에게 전달
- Invoker(기동자)의 역할
  - 명령의 행동을 개시하는 역할. Command 역할에서 정의되는 인터페이스(API)를 호출하는 역할 -> `ex` Main, DrawCanvas
  - Command 인터페이스의 execute 메소드 호출

---
# 📌 Check

---

### MORE! 어댑터
예제 프로그램의 Main 클래스에서는 `mouseDragged`, `windowClosing`메소드를 위해 필요없는 메소드들까지 전부 구현하고 있다.
프로그래밍을 간결하게 하기 위해 **어댑터**라는 클래스들이 java.awt.event 패키지에 준비되어 있다.
- MouseMotionListener -> MouseMotionAdapter
- WindowListener -> WindowAdapter
각 인터페이스를 구현하고 이 인터페이스가 요구하는 메소드를 모두 구현하고 있다
BUT, **아무것도 하지 않는 메소드**로만 거짓 구현 되어있어서 필요한 메소드만을 골라 구현할 수 있다

💥 특히 익명 내부 클래스와 함께 조합해서 어댑터를 사용하면 더욱 깔끔한 프로그램을 기술할 수 있다
#### BEFORE
```java
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    ...
    public Main(String title) throws HeadlessException {
      ...
      canvas.addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
      System.out.println("Dragged : ["+e.getPoint().x+", "+e.getPoint().y+"]");
      Command cmd = new DrawCommand(canvas, e.getPoint());
      history.append(cmd);
      cmd.execute();
    }
}
```
#### AFTER
```java
public Main(String title) throws HeadlessException{
      ...
      // 자바 익명 함수
      canvas.addMouseMotionListener(new MouseMotionAdapter(){
          @Override
          public void mouseDragged(MouseEvent e){
              System.out.println("Dragged : ["+e.getPoint().x+", "+e.getPoint().y+"]");
              Command cmd=new DrawCommand(canvas,e.getPoint());
              history.append(cmd);
              cmd.execute();
              }
          });
      }
```
- 거짓 mouseMoved 메소드 필요없음!
