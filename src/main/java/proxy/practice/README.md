# 연습문제 ⚾

## 21-1
### 예제 프로그램에서 PrinterProxy 클래스는 Proxy 클래스를 알고 있습니다. 즉, PrinterProxy 클래스 안에 Printer라는 클래스 이름이 직접 쓰여 있습니다. PrinterProxy 클래스가 Printer 클래스를 '몰라도 상관없도록' PrinterProxy 클래스를 수정하십시오. 


<br>


## 21-1 Solution
### [practice.PrinterProxy 코드 확인](https://github.com/KOO-YS/java-design-pattern/blob/master/src/main/java/proxy/practice/PrinterProxy.java)

<br>


## 21-2
### PrinterProxy 클래스에서는 setPrinterName 메소드와 realize 메소드가 synchronized 메소드로 되어 있습니다. synchronized 메소드로 하지 않았을 경우에 발생하는 문제를 제시해 보십시오. 


<br>


## 21-2 Solution
### 동시에 여러개의 스레드로부터 접근하게 되면 세팅되는 정보가 프록시와 본인 사이에 차이가 날 수 있기 때문에 synchronized를 설정
<br>