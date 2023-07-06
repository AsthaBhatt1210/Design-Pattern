package facadedesignpattern;
public class Students implements Library{
    @Override
    public void add() {
      System.out.println("This is student class");
    }
}
