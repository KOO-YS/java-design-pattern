# Proxy 패턴 📚 - 필요해지면 만들기

### Proxy
- 일을 해야 할 본인을 대신(대리)하는 사람. 본인이 아니더라도 가능한 일을 맡기기 위한 대리인
- 어디까지나 대리에 지나지 않기 때문에 할 수 있는 일에는 한계가 있다
---


#### 예제



--- 
### Proxy 패턴의 등장인물
- Subject(주체)의 역할
  - `Proxy`와 `ProxySubject` 역할을 동일시하기 위한 인터페이스(API)를 결정
  - `Subject` 역할 -> 예제 Printable
  - 예제 프로젝트의 Printable은 proxy와 proxysubject 역할의 차이를 의식할 필요가 없다
- Proxy(대리인)의 역할
  - Client(Main) 역할의 요구를 할 수 있는 만큼 처리
  - 만약 자신만으로 처리할 수 없으면, Proxy 역할은 RealSubject 역할에게 처리를 맡긴다
  - Subject 역할에서 정해지는 인터페이스(API)를 구현
- RealSubject(실제의 주체)의 역할
  - 대리인 Proxy 역할에서 감당할 수 없는 일이 발생했을 때 등장 -> '본인'!
  - Proxy 역할과 마찬가지로 Subject 역할에서 정해져 있는 인터페이스(API) 구현
- Client(의뢰인)의 역할
  - Proxy 패턴을 이용하는 역할
  - 예제 프로그램에서의 Main
---
# 📌 Check
---

### TIP! 대리인 Proxy

