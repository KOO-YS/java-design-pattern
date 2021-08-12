package interperter.execute;

import interperter.language.Context;
import interperter.language.Node;
import interperter.language.ProgramNode;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("etc/interpreter/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \""+text+"\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = "+node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
