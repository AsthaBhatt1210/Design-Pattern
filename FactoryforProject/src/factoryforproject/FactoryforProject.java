package factoryforproject;

import com.books.Books;
import com.books.CSBooks;
import com.books.ECBooks;
import com.books.FactoryBooks;
import com.books.ICTBooks;

public class FactoryforProject {
    public static void main(String[] args) {
        FactoryBooks ob1 = new FactoryBooks();
        Books ob = ob1.getInstance("ICT");
        ob.show();
    }
}
