package facadedesignpattern;
public class FacadeDesignPattern {

    public static void main(String[] args) {
        
      LibraryMaker ob = new LibraryMaker();
           ob.StudentMethod();
           ob.BooksMethod();
           ob.StaffMethod();
    }
}
