package facadedesignpattern;
public class Books implements Library {
    @Override
    public void add() {
      System.out.println("This is Book class");
    }
}
