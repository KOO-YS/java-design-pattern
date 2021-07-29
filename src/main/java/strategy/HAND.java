package strategy;

/**
 * 가위바위보의 손을 표시하는 클래스
 * 낼 수 있는 경우의 수 (int, str)
 */
public enum HAND {
    MOCK(0, "주먹"), JJI(1, "가위"), BBA(2, "보");

    int intVal;
    String strVal;
    HAND(int intVal, String strVal) {
        this.intVal = intVal;
        this.strVal = strVal;
    }

    public int getIntVal() {
        return intVal;
    }

    public String getStrVal() {
        return strVal;
    }
    public static HAND fromInt(int intVal) {
        for (HAND type : values()) {
            if (type.getIntVal() == intVal) {
                return type;
            }
        }
        return null;
    }

    public HAND getHand(int intVal) {
        return HAND.fromInt(intVal);
    }

    public boolean isStrongerThan(HAND h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(HAND h) {
        return fight(h) == -1;
    }

    private int fight(HAND h) {
        int m = this.getIntVal();
        int y = h.getIntVal();
        if(m == y) {
            return 0;
        } else if((m+1)%3 == y) return 1;
        else return -1;
    }
}
