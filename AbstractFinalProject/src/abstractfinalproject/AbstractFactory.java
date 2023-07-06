package abstractfinalproject;
public abstract class AbstractFactory {
    abstract BookInterface getBook(String book);
    abstract StudentInterface getStudent(String student);
}
