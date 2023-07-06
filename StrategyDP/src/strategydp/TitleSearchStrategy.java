package strategydp;
public class TitleSearchStrategy implements SearchStrategy {
    @Override
    public void search(String keyword) {
        System.out.println("Searching for books with title containing " + keyword);
    }
}
