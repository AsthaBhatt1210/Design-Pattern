package observerdp;
import java.util.*;
public class ObserverDP {
    public static void main(String[] args) {
        Library library = new Library();
        List<Observer> students = new ArrayList<>();
        students.add(new Student("Student 1"));
        students.add(new Student("Student 2"));
        students.add(new Student("Student 3"));
        for (Observer student : students) {
            library.attach(student);
        }
        library.setBookName("Design Patterns");
        library.setAvailability("available");
        library.detach(students.get(1));
        library.setBookName("Clean Code");
        library.setAvailability("not available");
    }
}
