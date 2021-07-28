# 연습문제 ⚾

## 6-1
### 예제 프로그램에서는 MessageBox 클래스와 UnderlinePen 클래스에 같은 동작을 하는 createClone 메소드가 정의되어 있습니다. 같은 동작을 하는 메소드가 하나의 프로그램에 복수로 정의되어 있는 것은 관리상 권장할 만한 것이 아니므로 이 메소드를 공유하고 싶다고 합시다. 어떻게 하면 될까요?
<br>

## 6-1 Solution
### MessageBox 클래스와 UnderlinePen 클래스가 createClone에서 완벽히 같은 내용의 코드로 구현해 놓았다
### ImpactProduct 추상 메소드에서 하나의 매소드 안에 구현한 뒤, 두 클래스가 상속받는 구조로 변경하자

> 참고 : anonymous 패키지 내 클래스들은 practice 폴더애 복사하여 변경하지만, framework 패키지 클래스들은 그대로 사용할 예정

[추상 클래스 ImpactProduct 코드 보기](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/singleton/practice/ImpactProduct.java)
- MessageBox 클래스와 UnderlinePen 클래스는 Product를 구현하는 것이 아닌 ImpactProduct를 상속받는다
- MessageBox 클래스와 UnderlinePen 클래스 내부 createClone()을 삭제할 수 있다 -> `중복제거`

<br>

## 6-2
### java.lang.Object 클래스는 clone 메소드를 가지고 있습니다. java.lang.Object는 java.lang.Cloneable 인터페이스를 구현하고 있습니까?
<br>

## 6-2 Solution

Object 클래스의 clone() 메소드 설명

```text
 The class {@code Object} does not itself implement the interface
 {@code Cloneable}, so calling the {@code clone} method on an object
 whose class is {@code Object} will result in throwing an exception at run time.
```
### 결론 : Object는 Cloneable 인터페이스를 구현하고 있지 않다
<br>

##### 💫 추가 테스트

```java
ObjSample obj = new ObjSample();
obj.clone();
```

**가정 1 .** ObjSample 클래스가 Cloneable 인터페이스를 구현하지 않았을 때,
```java
class ObjSample extends Object {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```
> 실행 시 `CloneNotSupportedException` 에러가 발생한다

**가정 2 .** ObjSample 클래스가 Cloneable 인터페이스를 구현했을 때,
```java
class ObjSample extends Object implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```
> 정상적으로 실행된다