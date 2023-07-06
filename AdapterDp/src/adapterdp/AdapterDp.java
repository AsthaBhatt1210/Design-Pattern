package adapterdp;
public class AdapterDp {
    public static void main(String[] args) {
       // Create an instance of the BookFinder class
      BookFinder bookFinder = new BookFinder();

      // Create an instance of the LibraryAdapter class, passing the BookFinder as a BookCatalog parameter
      Library library = new LibraryAdapter(bookFinder);

      // Use the Library interface to search for a book in the catalog
      library.search("The Great Gatsby");
      
      // Create an instance of the BookCatalogAdapter class, passing the Library instance as a parameter
      BookCatalog bookCatalog = new BookCatalogAdapter(library);

      // Use the BookCatalog interface to find a book in the catalog
      bookCatalog.findBook("To Kill a Mockingbird");
    }
}
