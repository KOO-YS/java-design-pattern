# 연습문제 ⚾

## 11-1
### 파일 시스템 이외에 Composite 패턴이 적용되는 예를 생각해보세요
<br>

## 11-1 Solution
#### HTML의 div 태그
<br>

## 11-2
### 예제 프로그램에 Entry의 인스턴스에서 '풀 패스'를 얻는 기능을 추가하려고 합니다


<br>


## 11-2 Solution
##### in `Entry.java`
```java
public String getFullPath() {
    StringBuffer buffer = new StringBuffer();
    buffer.insert(0, this.getName());

    Entry now = this.parent;
    while(now != null) {
        buffer.insert(0, now.getName()+"/");
        now = now.parent;
    }
    return buffer.toString();
}
```

##### in `Directory.java`
```java
@Override
public Entry add(Entry entry) {     // 엔트리 추가
    directory.add(entry);
    entry.parent = this;
    return this;
}
```