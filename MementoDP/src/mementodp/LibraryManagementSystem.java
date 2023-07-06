package mementodp;
public class LibraryManagementSystem {
    private Book book;
    private CareTaker careTaker = new CareTaker();
    
    public void addBook(int id, String title, String author, String publisher) {
        book = new Book(id, title, author, publisher);
        careTaker.addBookMemento(new BookMemento(book));
        System.out.println("Book added: " + book);
    }
    
    public void updateBookTitle(String title) {
        careTaker.addBookMemento(new BookMemento(book));
        book.setTitle(title);
        System.out.println("Book updated: " + book);
    }
    
     public void undo() {
        if (careTaker.size() > 0) {
            BookMemento bookMemento = careTaker.getBookMemento(careTaker.size() - 1);
            book = bookMemento.getSavedBook();
            careTaker.removeBookMemento(careTaker.size() - 1);
            System.out.println("Undo: " + book);
        } else {
            System.out.println("Cannot undo - no previous action.");
        }
     }
}
