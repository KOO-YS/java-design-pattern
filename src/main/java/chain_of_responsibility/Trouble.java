package chain_of_responsibility;

/**
 * 누군가는 반드시 처리해야 하는 트러블 발생
 */
public class Trouble {
    private int number;     // 트러블 번호
    public Trouble(int number) {        // 트러블의 생성
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " +number + ']';
    }
}
