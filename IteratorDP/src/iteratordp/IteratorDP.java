package iteratordp;
import java.util.*;
public class IteratorDP {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Student 1");
        vector.add("Student 2");
        vector.add("Student 3");
        vector.add("Student 4");
        vector.add("Student 5");
        System.out.println("Vector: " + vector);
        Iterator value = vector.iterator();
        System.out.println("The iterator values of students in library: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
