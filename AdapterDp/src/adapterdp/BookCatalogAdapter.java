package adapterdp;
public class BookCatalogAdapter implements BookCatalog {
Library library;
   public BookCatalogAdapter(Library library) {
      this.library = library;
   }
    @Override
    public void findBook(String bookTitle) {
       library.search(bookTitle);
    }
}
