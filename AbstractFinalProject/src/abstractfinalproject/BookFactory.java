package abstractfinalproject;
public class BookFactory extends AbstractFactory{
    @Override
    BookInterface getBook(String book) {
        if(book == null)
            return null;
        if(book.equalsIgnoreCase("book_id"))
           return new Book_id();
         else if(book.equalsIgnoreCase("book_name"))
           return new Book_name();
         else if(book.equalsIgnoreCase("book_details"))
           return new Book_details();
           
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    StudentInterface getStudent(String student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
