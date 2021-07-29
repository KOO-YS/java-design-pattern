package composite;

/**
 * 디렉토리와 파일 두 가지 클래스를 하나로 모은 형태의 상위 클래스
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    
    public Entry add(Entry entry) throws FileTreatmentException {
        // entry 추가
        throw new FileTreatmentException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);       // prefix : 종류 표시

    public String toString() {
        return getName()+ " ("+getSize()+")";
    }
    
}

class FileTreatmentException extends Throwable {

}
