package mementodp;
import java.util.ArrayList;
import java.util.List;
public class CareTaker {
    private List<BookMemento> bookMementos = new ArrayList<>();
    
    public void addBookMemento(BookMemento bookMemento) {
        bookMementos.add(bookMemento);
    }
    
    public BookMemento getBookMemento(int index) {
        return bookMementos.get(index);
    }
    
    public int size() {
        return bookMementos.size();
    }
    
    public void removeBookMemento(int index) {
        bookMementos.remove(index);
    }
}


    
   









