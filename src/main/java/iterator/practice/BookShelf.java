package iterator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 책장을 나타내는 클래스
 */
public class BookShelf implements Aggregate {
    private List<Book> books;       // private : 클래스 외부로부터 뜻하지 않게 변경되는 것을 방지

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    /**
     * @return 책장의 책을 하나씩 나열하고 싶을 때 호출
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
