package compositedesign;
public class Books implements Library{
    private String book_name;
    private long book_id;
    private String book_author;
    public Books(long book_id, String book_name, String book_author)
    {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
    }
    @Override
    public void showLibraryDetails() {
       System.out.println("Books: " + book_id+ " " +book_name+ " " +book_author);
    }
}
