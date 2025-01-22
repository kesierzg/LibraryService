import java.util.List;

public class LibraryService {
    private Library library;

    public LibraryService() {
        this.library = new Library();
    }

    public void addBookToLibrary(String tytul, String autor, String isbn) {
        Book book = new Book(tytul, autor, isbn);
        library.addBook(book);
        System.out.println("Dodano książkę: " + book);
    }

    public void removeBookFromLibrary(String isbn) {
        boolean removed = library.removeBook(isbn);
        if (removed) {
            System.out.println("Książka z ISBN " + isbn + " została usunięta");
        } else {
            System.out.println("Nie znaleziono ksiązki z ISBN: " + isbn);
        }
    }

    public void searchBooksByTytul(String tytul) {
        List<Book> books = library.searchByTytul(tytul);
        if (books.isEmpty()) {
            System.out.println("Nie znaleziono ksiązki o tytule: " + tytul);
        } else {
            System.out.println("Znaleziono książki: ");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayAllBooks() {
        List<Book> books = library.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("W bibliotece nie ma żadnych książek :(");
        } else {
            System.out.println("Lista ksiązek w bibliotece: ");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}