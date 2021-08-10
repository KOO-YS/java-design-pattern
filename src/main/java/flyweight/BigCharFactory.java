package flyweight;

import java.util.HashMap;

/**
 * BigChar의 인스턴스를 생성하는 공장
 */
public class BigCharFactory {
    // 이미 BigChar의 인스턴스를 관리
    private HashMap pool = new HashMap();
    // Singleton pattern
    private static BigCharFactory singleton = new BigCharFactory();
    // constructor
    private BigCharFactory() {
    }
    // get single instance
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // BigChar의 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get(""+charname);
        if(bc == null) {
            bc = new BigChar(charname);     // 이미 생성된 인스턴스가 없으면 추가
            pool.put(""+charname, bc);
        }
        return bc;
    }

}

