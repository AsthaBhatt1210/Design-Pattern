package flyweightdp;
public class Book {
    private String title;
    private String author;
    private String publisher;
    
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Publisher: " + publisher);
    }
}
