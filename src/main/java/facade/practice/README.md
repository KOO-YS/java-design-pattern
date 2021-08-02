# 연습문제 ⚾

## 15-1
### 클래스 설계자는 미래의 확장이나 프로그램의 개선에 대비해서 PageMaker 클래스만을 pagemaker 패키지의 외부에서 이용할 수 있도록 만들려고 합니다.
### Database 클래스와 HtmlWriter 클래스를 pagemaker 패키지의 외부에서 이용할 수 없도록 하기 위해서는 예제 프로그램을 어떻게 변경해야 됩니까?
<br>

## 15-1 Solution
### PageMaker와 나머지 역할 (Database, HtmlWriter)을 같은 패키지에 배치한 뒤, 역할 클래스에게 `public` 접근 제한자를 없앤다.
### default 접근제한자를 가진 역할 클래스들은 패키지 외부에서 접근할 수 없고, PageMaker는 그대로 사용이 가능하다

<br>


## 15-2
### maildata.txt에 포함되어 있는 사용자의 메일 주소의 링크페이지를 작성하는 makeLinkPage 메소드를 PageMaker 클래스에 추가해주십시오

<br>

## 15-2 Solution
### in PageMaker.java
```java
public static void makeLinkPage(String filename) {
    try {
        Properties mailprop = Database.getProperties("maildata");
        Iterator<String> usernames = mailprop.stringPropertyNames().iterator();
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title("Link page");
        while (usernames.hasNext()) {
            String email = usernames.next();
            writer.mailto(email, mailprop.getProperty(email));
        }
        writer.close();
        System.out.println(filename+" is created");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

<br>

