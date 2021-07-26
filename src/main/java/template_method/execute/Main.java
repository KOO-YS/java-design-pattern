package template_method.execute;

import template_method.AbstractDisplay;
import template_method.CharDisplay;
import template_method.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello world");



        d1.display();
        d2.display();
    }
}
