package flyweightdp;
import java.util.HashMap;
import java.util.Map;
public class BookFactory {
    private Map<String, Book> booksMap;
    public BookFactory() {
        booksMap = new HashMap<>();
    }
    public Book getBook(String title, String author, String publisher) {
        String key = title + author + publisher;
        
        if (booksMap.containsKey(key)) {
            return booksMap.get(key);
        } else {
            Book book = new Book(title, author, publisher);
            booksMap.put(key, book);
            return book;
        }
    }
}
