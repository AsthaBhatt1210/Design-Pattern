package factory;

import com.books.Books;
import com.books.FactoryBook;
import com.books.HorrorBooks;
import com.books.Novels;
import com.books.Storybooks;

public class Factory {

    public static void main(String[] args) 
    {
        FactoryBook ob1 = new FactoryBook();
        Books ob = ob1.getInstance("Novel");
         //Books ob = new HorrorBooks();
        ob.show();
    }
}
