package statedp;
public class Library {
    private State state;

    public Library() {
        state = new AvailableState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void requestBook(String bookTitle) {
       state.handleRequest(this, bookTitle);
    }

    boolean hasBook(String bookTitle) {
        return true;
    }

    void issueBook(String bookTitle) {
    }
}
