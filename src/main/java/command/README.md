# Command ν¨ν΄ π - λͺλ Ήμ ν΄λμ€λ‘ νννκΈ°

### Command
- λͺλ Ήμ νννλ ν΄λμ€
- μ€ννκ³  μΆμ μΌμ 'λ©μλλ₯Ό νΈμΆ'νλ λμ μΈ μ²λ¦¬λ‘ νννλ κ²μ΄ μλλΌ, **λͺλ Ήμ λνλ΄λ ν΄λμ€μ μΈμ€ν΄μ€λ‘ νλμ λ¬Όκ±΄μ²λΌ ννν  μ μλ€**
- EventλΌκ³ λ λΆλ₯Έλ€
    - 'μ΄λ²€νΈ κ΅¬λ νλ‘κ·Έλλ°'μμ μ¬μ©λλ 'μ΄λ²€νΈ'μ κ°μ μλ―Έ

---


#### μμ 



--- 
### Command ν¨ν΄μ λ±μ₯μΈλ¬Ό
- Command(λͺλ Ή)μ μ­ν 
  - λͺλ Ήμ μΈν°νμ΄μ€(API)λ₯Ό μ μνλ μ­ν  -> `ex` Command
- ConcreteCommand(κ΅¬μ²΄μ  λͺλ Ή)μ μ­ν 
  - Command μ­ν μ μΈν°νμ΄μ€(API)λ₯Ό μ€μ λ‘ κ΅¬ννκ³  μλ μ­ν  -> `ex` MacroCommand, DrawCommand
- Receiver(μμ μ)μ μ­ν 
  - λͺλ Ήμ μ€νν  λ λμμ΄ λλ μ­ν  -> `ex` DrawCanvas
- Client(μλ’°μ)μ μ­ν 
  - ConcreteCommand μ­ν μ μμ±νκ³  κ·Έ μ¬μ΄μ Receiver μ­ν μ ν λΉ -> `ex` Main
  - λ§μ°μ€μ λλκ·Έμ λ§μΆ° DrawCommand μΈμ€ν΄μ€λ₯Ό μμ±, κ·Έ μ¬μ΄μ Receiver μ­ν λ‘ DrawCanvas μΈμ€ν΄μ€λ₯Ό μμ±μμκ² μ λ¬
- Invoker(κΈ°λμ)μ μ­ν 
  - λͺλ Ήμ νλμ κ°μνλ μ­ν . Command μ­ν μμ μ μλλ μΈν°νμ΄μ€(API)λ₯Ό νΈμΆνλ μ­ν  -> `ex` Main, DrawCanvas
  - Command μΈν°νμ΄μ€μ execute λ©μλ νΈμΆ

---
# π Check

---

### MORE! μ΄λν°
μμ  νλ‘κ·Έλ¨μ Main ν΄λμ€μμλ `mouseDragged`, `windowClosing`λ©μλλ₯Ό μν΄ νμμλ λ©μλλ€κΉμ§ μ λΆ κ΅¬ννκ³  μλ€.
νλ‘κ·Έλλ°μ κ°κ²°νκ² νκΈ° μν΄ **μ΄λν°**λΌλ ν΄λμ€λ€μ΄ java.awt.event ν¨ν€μ§μ μ€λΉλμ΄ μλ€.
- MouseMotionListener -> MouseMotionAdapter
- WindowListener -> WindowAdapter
κ° μΈν°νμ΄μ€λ₯Ό κ΅¬ννκ³  μ΄ μΈν°νμ΄μ€κ° μκ΅¬νλ λ©μλλ₯Ό λͺ¨λ κ΅¬ννκ³  μλ€
BUT, **μλ¬΄κ²λ νμ§ μλ λ©μλ**λ‘λ§ κ±°μ§ κ΅¬ν λμ΄μμ΄μ νμν λ©μλλ§μ κ³¨λΌ κ΅¬νν  μ μλ€

π₯ νΉν μ΅λͺ λ΄λΆ ν΄λμ€μ ν¨κ» μ‘°ν©ν΄μ μ΄λν°λ₯Ό μ¬μ©νλ©΄ λμ± κΉλν νλ‘κ·Έλ¨μ κΈ°μ ν  μ μλ€
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
      // μλ° μ΅λͺ ν¨μ
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
- κ±°μ§ mouseMoved λ©μλ νμμμ!
