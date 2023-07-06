package mementodp;
public class MementoDP {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        // Add a new book
        library.addBook(1, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company");
        // Update the title of the book
        library.updateBookTitle("The Great Gatsby");
        // Undo the last action
        library.undo();
    }
}
