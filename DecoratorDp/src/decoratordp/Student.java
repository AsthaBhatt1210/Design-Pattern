package decoratordp;
public class Student implements Library {
    @Override
    public void add() { 
        System.out.println("This is student class");
    }
}
