package strategydp;
public class AuthorSearchStrategy implements SearchStrategy {
    @Override
    public void search(String keyword) {
         System.out.println("Searching for books with author name containing " + keyword);
    }
}
