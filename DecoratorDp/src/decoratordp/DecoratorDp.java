package decoratordp;
public class DecoratorDp {
    public static void main(String[] args) {
      Library ob = new Book();
      Library ob1 = new BTechBooks(new Book());
      Library ob2 = new AddBooks(new Student());
      Library ob3 = new AddBooks(new Staff());
     System.out.println("Main class for Book");
     ob1.add();
     System.out.println("Main class for Student");
     ob2.add();
     System.out.println("Main class for Staff");
     ob3.add();
    }
}
