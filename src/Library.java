import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> searchByTytul(String tytul) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTytul().toLowerCase().contains(tytul.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
