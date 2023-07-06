package decoratordp;
public class BTechBooks extends AddBooks {
    public BTechBooks(Library book) {
        super(book);
    }
    public void add()
    {
        book.add();
        setBook(book);
    }
    private void setBook(Library book) {
      System.out.println("BTechBooks added");
    }
 }
