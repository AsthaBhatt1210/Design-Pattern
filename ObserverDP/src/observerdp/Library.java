package observerdp;
import java.util.*;
public class Library implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String bookName;
    private String availability;
    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
        notifyObservers();
    }
    @Override
    public void attach(Observer observer) {
          observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(bookName, availability);
        }
    }
}
