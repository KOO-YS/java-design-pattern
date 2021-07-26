# 연습문제 ⚾

## 2-1
### 예제 프로그램에서는 PrintBanner 클래스의 인스턴스를 작성할 때 다음과 같이 Print형의 변수를 대입하고 있습니다. 
```java
Print P = new PrintBanner();
``` 
### 왜 다음과 같이 PrintBanner형의 변수에 대입하지 않을까요?
```java
PrintBanner P = new PrintBanner();
``` 

<br>

## 2-1 Solution
### PrintBanner 대신 Print 변수에 대입한 이유 
- PrintBanner가 Print의 주요 메소드들을 구현했다는 것을 나타내기 위해서
- 인터페이스(필요 기능)에 맞는 구현체(Adapter)라는 것을 나타내기 위해 


---
<br>

## 2-2
### java.util.Properties 클래스는
```text
year = 2004
month = 4
day = 21
```
###처럼 키와 그 값의 쌍(property)을 관리하기 위한 것입니다. java.util.Properties 클래스에는 property를 스트림에서 읽거나 스트림에서 쓰기 위해 다음과 같은 메소드가 준비되어 있습니다.
```java
void load(InputStream in) throws IOException
 : 속성의 집합을 InputStream에서 읽는다

void store(OutputStream out, String header) throws IOException
 : 속성의 집합을 OutputStream에 쓴다. header는 코멘트 문자열 
```
### Adapter 패턴을 사용해서 Property의 집합을 파일에 보존하는 FileProperties 클래스를 만들어야 합니다. 여기에서 ...(책에서 계속)