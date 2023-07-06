package strategydp;
public class Library {
    private SearchStrategy searchStrategy;
    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void search(String keyword) {
        if (searchStrategy == null) {
            throw new IllegalStateException("Search strategy not set");
        }
        searchStrategy.search(keyword);
    }
}
