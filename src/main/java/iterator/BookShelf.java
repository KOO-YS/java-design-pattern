package iterator;

/**
 * 책장을 나타내는 클래스
 */
public class BookShelf implements Aggregate{
    private Book[] books;       // private : 클래스 외부로부터 뜻하지 않게 변경되는 것을 방지
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    /**
     * @return 책장의 책을 하나씩 나열하고 싶을 때 호출
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
