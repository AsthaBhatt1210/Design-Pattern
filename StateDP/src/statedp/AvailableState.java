package statedp;
public class AvailableState implements State{
    @Override
    public void handleRequest(Library library, String bookTitle) {
       // Check if book is available
        if (library.hasBook(bookTitle)) {
        // Issue book to user
          System.out.println("This book is available");
        library.issueBook(bookTitle);
        // Set state to CheckedOutState
        library.setState(new CheckedOutState());
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }
}