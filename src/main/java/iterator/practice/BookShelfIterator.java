package iterator.practice;

/**
 * 책장을 검색하는 클래스
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;      // 현재 주목하고 있는 책을 가리키는 첨자

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
