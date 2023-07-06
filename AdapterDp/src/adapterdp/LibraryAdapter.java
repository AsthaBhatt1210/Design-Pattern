package adapterdp;
public class LibraryAdapter implements Library {
BookCatalog bookCatalog;
   public LibraryAdapter(BookCatalog bookCatalog) {
      this.bookCatalog = bookCatalog;
   }
    @Override
    public void search(String bookTitle) {
      bookCatalog.findBook(bookTitle);  
    }
}
