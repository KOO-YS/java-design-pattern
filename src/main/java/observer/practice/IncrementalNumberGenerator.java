package observer.practice;

import observer.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;
    private int add;
    public IncrementalNumberGenerator(int start, int end, int add) {
        this.start = start;
        this.end = end;
        this.add = add;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=start; i<end; i+= add) {
            number = i;
            notifyObservers();
        }
    }
}
