package strategydp;
public class StrategyDP {
    public static void main(String[] args) {
        Library library = new Library();

        // set the search strategy to search by title
        library.setSearchStrategy(new TitleSearchStrategy());
        library.search("Harry Potter");

        // set the search strategy to search by author
        library.setSearchStrategy(new AuthorSearchStrategy());
        library.search("J.K. Rowling");
    }
}
