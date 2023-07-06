package adapterdp;
public class BookFinder implements BookCatalog {
    @Override
    public void findBook(String bookTitle) {
      System.out.println("Searching book in catalog. Title: " + bookTitle);
    }
}
