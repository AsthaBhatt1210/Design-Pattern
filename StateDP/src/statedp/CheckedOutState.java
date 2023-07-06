package statedp;
public class CheckedOutState implements State{
    @Override
    public void handleRequest(Library library, String bookTitle) {
          System.out.println("Sorry, the book is already checked out.");
    }
}
