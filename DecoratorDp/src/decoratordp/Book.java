package decoratordp;
public class Book implements Library {
    @Override
    public void add() {
      System.out.println("This is book class");
    }
}
