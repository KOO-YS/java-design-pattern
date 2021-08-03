# Mediator 패턴 📚 - 중개인을 통해서 처리하기

### Mediator
- 곤란한 일이 생기거나 모임 전체에 영향을 미칠만한 일이 발생하면 중개인에게 알리고, 중개인의 지시대로 실행
- 모임의 각 회원이 멋대로 다른 회원과 대화해서 판단하는 것이 아니라, 언제나 중개인을 통해서 행동하도록 함
- 중개인은 회원으로부터 올라온 보고를 기초로 대국적인 판단을 해서 각 회원에게 지시를 내림
---


#### 예제



--- 
### Mediator 패턴의 등장인물
- Mediator(조정자, 중개자)의 역할
  - Colleague 역할과 통신을 해서 조정을 실행하기 위한 인터페이스(API)를 결정
- ConcreteMediator(구체적인 조정자, 중재자)의 역할
  - Mediator 역할의 인터페이스(API)를 구현해서 실제의 조정을 실행
- Colleague(동료)의 역할
  - Mediator 역할과 통신을 실행할 인터페이스(API)를 결정
- ConcreteColleague(구체적인 동료)의 역할
  - Colleague 역할의 인터페이스(API) 구현
---
# 📌 Check

---

### TIP! 재이용할 수 있는 것은 무엇인가?
예제 프로그램 내에서 ConcreteColleague 역할의 (ColleagueButton, ColleagueTextField, ...)은 새로운 다이얼로그에서도 재이용할 수 있다.
-> ConcreteColleague 역할 안에는 특정한 다이얼로그에 의존하는 코드가 없기 때문
<br>
코드 가운데 어플리케이션에 대한 의존성이 높은 부분은 ConcreteMediator 역할인 LoginFrame 클래스 안에 갇혀 있다.
**어플리케이션에 대한 의존도가 높다는 것은 재이용성이 낮다**라는 뜻

