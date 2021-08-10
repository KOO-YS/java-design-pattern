package flyweight;

/**
 * BigChar를 모은 '큰 문자열' 클래스
 */
public class BigString {
    // '큰 문자'의 배열
    private BigChar[] bigChars;
    // 생성자
    public BigString(String string) {
        getShared(string);
    }
    public void getShared(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i=0; i<bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));     // 기존에 가진 인스턴스는 공유
        }
    }
    // 연습문제 20-1
    public BigString(String string, Boolean shared) {
        if(shared) getShared(string);
        else {
            bigChars = new BigChar[string.length()];
            for (int i=0; i<bigChars.length; i++) {
                bigChars[i] = new BigChar(string.charAt(i));        // 공유 안받고 그때그떄 생성
            }
        }
    }

    // 표시
    public void print() {
        for (int i=0; i<bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
