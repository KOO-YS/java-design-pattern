package bridge.practice;

import bridge.CountDisplay;
import bridge.Display;
import bridge.StringDisplayImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 9-1
        RandomDisplay randomTest = new RandomDisplay(new StringDisplayImpl("test string"));
        randomTest.randomDisplay(6);

        // 9-2
        String filePath = "sampleText.txt";
        Display textTest = new Display(new FileDisplayImpl(filePath));
        textTest.display();


    }
}
