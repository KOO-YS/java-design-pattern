# 연습문제 ⚾

## 16-1
### '사용자 로그인일 때 사용자 이름과 패스워드 둘 다 4문자 이상 입력되었을 경우에만 OK 버튼이 유효'하도록 예제 프로그램 수정. 수정할 필요가 있는 클래스가 무엇인지 생각해 보십시오


<br>


## 16-1 Solution
### in LoginFrame, 4문자 이상 입력되었을때 다음 항목 유효처리
```java
// textUser or textPass의 변경이 있었다
// 각 Colleague의 유/무효를 판정한다
private void userpassChanged() {
    if(textUser.getText().length() >= 4) {
        textPass.setColleagueEnabled(true);
        if(textPass.getText().length() >= 4 ) {
            buttonOk.setColleagueEnabled(true);
        } else {
            buttonOk.setColleagueEnabled(false);
        }
    } else {
        textPass.setColleagueEnabled(false);
        buttonOk.setColleagueEnabled(false);
    }
}
```
<br>

## 16-2
### 예제 프로그램의 ColleagueButton, ColleagueTextField, ColleagueCheckbox를 잘 보면 이 클래스들은 모두 mediator라는 필드를 가지고 있으면 setMediator의 내용도 동일합니다. 프로그램을 단순하게 하기 위해서 Colleague 인터페이스 안에 mediator 라는 필드를 넣어서 setMediator 메소드를 구현할 수 있습니까?


<br>


## 16-2 Solution
### 인터페이스에서 메소드를 구현할 수 없으며, 
### 이미 Colleague 클래스들은 각 해당되는 GUI 상위 클래스를 추상 클래스로 이미 가지고 있기 때문에 추상 클래스로도 만들 수 없다. 
<br>

