package flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * '큰 문자'를 나타내는 클래스
 */
public class BigChar {
    private static final String FILEPATH = "etc/flyweight/";
    // 문자의 이름
    private char charname;
    // 큰 문자를 표현하는 문자열
    private String fontdata;
    // 생성자
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILEPATH+"big"+charname+".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append('\n');
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            this.fontdata = charname+"?";
        }
        this.fontdata = fontdata;
    }
    public void print() {
        System.out.println(fontdata);
    }
}
