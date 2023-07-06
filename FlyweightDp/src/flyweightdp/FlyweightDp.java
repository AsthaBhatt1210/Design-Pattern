package flyweightdp;
public class FlyweightDp {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        library.addBook("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        library.addBook("Pride and Prejudice", "Jane Austen", "T. Egerton");  
    }
}
