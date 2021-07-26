# 연습문제 ⚾

## 1-1
### 예제 프로그램의 BookShelf 클래스에서는 최초에 지정한 서가의 크기를 초과해서 책을 넣을 수 없습니다. 그래서 배열이 아니라 java.util.ArrayList를 사용해서 서가의 크기를 초과해도 책을 추가할 수 있도록 하십시오.

<br>


## 1-1 Solution
### *변경 코드* 
- `iterator.practice.BookShelf`
- `iterator.practice.execute.Main`

<br>

> Iterator의 의도대로
>```java
> while (it.hasNext()) {
>    Book book = (Book) it.next();
>    System.out.println(book.getName());
> }
>```
>코드는 건드리지 않았다