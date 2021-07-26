package iterator.practice.execute;

import iterator.practice.Book;
import iterator.practice.BookShelf;
import iterator.practice.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("연습문제"));
        bookShelf.appendBook(new Book("배열에서"));
        bookShelf.appendBook(new Book("리스트로 변경"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
