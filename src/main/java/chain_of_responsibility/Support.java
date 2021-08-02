package chain_of_responsibility;

/**
 * 트러블을 해결할 사슬을 만들기 위한 추상 클래스
 */
public abstract class Support {
    private String name;        // 이 트러블 해결자의 이름
    private Support next;       // 떠넘기는 곳

    public Support(String name) {   // 트러블 해결자의 생성
        this.name = name;
    }

    public Support setNext(Support next) {     // 떠넘기는 곳 설정
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {    // 트러블 해결의 수순
        if (resolve(trouble)) done(trouble);
        else if (next != null) next.support(trouble);
        else fail(trouble);
//
//        for (Support s = this; ; s = s.next) {
//            if(s.resolve(trouble)) {
//                s.done(trouble);
//                break;
//            // next가 null일 때까지 반속
//            } else if(s.next == null) {
//                s.fail(trouble);
//                break;
//            }
//        }
    }

    /**
     * 해결용 메소드
     * @return true일 때에는 요구가 처리되었음을 나타내고, false의 경우는 아직 요구가 처리되지 않았음(== 다음으로 떠넘긴다)을 나타냅니다.
     */
    protected abstract boolean resolve(Trouble trouble);

    private void done(Trouble trouble) {        // 해결
        System.out.println(trouble+" is resolved by "+this+".");
    }

    private void fail(Trouble trouble) {        // 미해결
        System.out.println(trouble+" cannot be resolved");
    }

    @Override
    public String toString() {
        return "["+name+"]";
    }
}
