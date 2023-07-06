package observerdp;
public class Student implements Observer {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(String bookName, String availability) {
        System.out.println("Hello " + name + ", the book " + bookName + " is now " + availability);
    }
}
