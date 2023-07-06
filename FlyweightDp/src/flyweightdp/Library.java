package flyweightdp;
public class Library {
    private BookFactory bookFactory;
    public Library() {
        bookFactory = new BookFactory();
    }
    public void addBook(String title, String author, String publisher) {
        Book book = bookFactory.getBook(title, author, publisher);
        book.display();
    }
}
