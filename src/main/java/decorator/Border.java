package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.Reader;

/**
 * 장식을 나타내는 추상 클래스
 */
public abstract class Border extends Display{
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
