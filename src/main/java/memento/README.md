# Memento 패턴 📚 - 상태를 저장하기

### Memento
- `Ctrl+Z` 실행 취소 기능을 사용하려면 **인스턴스가 가지고 있는 정보를 저장해 둘 필요가 있다**
  - 단, 저장만 해서는 안되고, 저장한 정보로부터 인스턴스를 원래의 상태로 되돌려야 한다
- 인스턴스를 복원하기 위해서는 인스턴스 내부의 정보를 자유롭게 액세스할 수 있어야 한다
  - 원하지 않는 액세스를 허용하면 클래스 내부 구조에 의존한 코드가 흩어져 클래스의 수정을 어렵게 한다 -> **캡슐화의 파괴**
- 인스턴스의 상태를 나타내는 역할을 도입해서 캡슐화의 파괴에 빠지지 않고 저장과 복원을 실행하는 패턴
---


#### 예제



--- 
### Memento 패턴의 등장인물
- Originator(작성자)의 역할
  - 자신의 현재 상태를 저장하고 싶을 때 Memento 역할을 만듦
  - 이전의 Memento 역할을 전달받으면 그 **Memento 역할을 만든 시점의 상태로 돌리는 처리**
- Memento(기념품)의 역할
  - Originator 역할의 내부 정보를 정리
  - Originator 역할의 내부 정보를 가지고 있지만, **누구에게도 공개하지 않음**
  - **Memento의 종류**
    - `wide interface(API)` : 오브젝트를 원래 상태로 돌리기 위해 필요 정보를 얻을 수 있는 API 
     ▶ Mememto 역할의 내부 상태를 속속들이 확인하기 때문에 이것을 사용하는 것은 Originator 역할뿐
    - `narrow interface(API)` : 스탭샷을 관리하는 역할에게 보여주는 API. 내부 상태가 외부에 공개되는 것을 방지
- Caretaker(관리인)의 역할
  - 현재의 Originator 역할의 상태를 저장하고 싶을 때, 그것을 Originator 역할에게 notice
  - notice를 받은 Originator가 Memento 역할을 만들어서 관리자에게 전달
  - 이 역할은 Memento 역할이 갖는 2종류의 인터페이스 중 `narrow interface`만 사용 가능
  
> Originator 역할과 Memento 역할은 "강하게" 연결되어 있지만,
> Caretaker 역할과 Mememto 역할은 "유연하게" 연결되어 있습니다.

---
# 📌 Check

---

### TIP! 두 개의 인터페이스(API)와 액세스 제어
예시 프로그램에서는 두 가지 인터페이스(narrow & wide)를 실현하기 위해서 java 엑세스 제어 기능을 사용
| 액세스 제어 | 해설                               |
| ----------- | ---------------------------------- |
| public      | 모든 클래스에서                    |
| protected   | 그 패키지 + 하위 클래스에서 보인다 |
| (X)         | 패키지 내부에서만                  |
| private     | 클래스 내부에서만                  |
<br>

예제 프로그램의 Memento 클래스의 메소드나 필드에는 
- public이 붙어있는 것
- 아무 것도 없는 것
으로 분류되어 있어서 어떤 클래스에게 보이고, 어떤 클래스에게는 보이지 않을 것인지 표현할 수 있다
<br>

### WHY? CareTaker 역할과 Originator 역할을 분리하는 이유
Originator가 수행하면 될 기능에 대해 왜 두 역할을 분리할까..
##### Caretaker
- 어느 시점에 스냅샷을 찍을지 결정
- 언제 undo할지를 결정하는 Memento 저장
##### Originator
- Memento 역할을 만듦
- 제공된 Memento 역할을 사용해서 자신의 상태를 원래 상태로 돌림
--- 
이런 식으로 역할 분담을 해두면 추후에
- 여러 단계의 undo를 실행하도록 변경하고 싶다?
- undo 기능 뿐만 아니라 현재의 상태를 파일에 저장하고 싶다?
같은 **새 요구사항이 들어오더라도 Originator를 변경할 필요가 전혀 없다**
  