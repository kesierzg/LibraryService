public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        libraryService.addBookToLibrary("Dzieci z Bullerbyn", "Astrid Lindgren", "123456789");
        libraryService.addBookToLibrary("HTML For Dummies", "Andy Harris", "987654321");
        libraryService.addBookToLibrary("Pan Tadeusz", "Adam Mickiewicz", "112233445");

        libraryService.displayAllBooks();

        libraryService.searchBooksByTytul("HTML");

        libraryService.removeBookFromLibrary("987654321");
    }
}
