package compositedesign;
public class CompositeDesign {
    public static void main(String[] args) {
        
    Books lib1 = new Books(1,"Data structures","Reema Theraja");
    Books lib2 = new Books(2,"C++","Bjarne Stroustrup");
    LibraryManagement ob = new LibraryManagement();
    ob.addLibrary(lib1);
    ob.addLibrary(lib2);
    
    Student stu1 = new Student(1,"Astha");
    Student stu2 = new Student(2,"Diya");
    LibraryManagement ob1 = new LibraryManagement();
    ob1.addLibrary(stu1);
    ob1.addLibrary(stu2);

    Book_shelf shf1 = new Book_shelf(1,"Qr1");
    Book_shelf shf2 = new Book_shelf(2,"Qr2");
    LibraryManagement ob2 = new LibraryManagement();
    ob2.addLibrary(shf1);
    ob2.addLibrary(shf2);
            
    LibraryManagement ob3 = new LibraryManagement();
    ob3.addLibrary(ob);
    ob3.addLibrary(ob1);
    ob3.addLibrary(ob2);
    ob3.showLibraryDetails();
  }
}
