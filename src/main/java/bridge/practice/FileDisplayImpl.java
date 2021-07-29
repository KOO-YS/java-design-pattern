package bridge.practice;

import bridge.DisplayImpl;
import bridge.StringDisplayImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private BufferedReader reader;
    StringBuffer buffer = new StringBuffer();
    private String string;
    private int width;

    public FileDisplayImpl(String path) throws IOException {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 여러 줄 받기
        String line;
        while((line = reader.readLine()) != null) {
            buffer.append(line).append('\n');
            width = Math.max(width, line.getBytes().length);
        }
        string = buffer.toString();
        reader.close();
    }

    @Override
    public void rawOpen() {
        printLine(width);
        System.out.println("FROM TEXT FILE * * *");
    }

    @Override
    public void rawPrint() {
        System.out.print(string);
    }

    @Override
    public void rawClose() {
        printLine(width);
    }

}
