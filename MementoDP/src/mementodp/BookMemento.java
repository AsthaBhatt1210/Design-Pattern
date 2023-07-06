package mementodp;
public class BookMemento {
    private Book book;
    public BookMemento(Book book) {
        this.book = new Book(book.getId(), book.getTitle(), book.getAuthor(), book.getPublisher());
    }
    public Book getSavedBook() {
        return book;
    }
}
