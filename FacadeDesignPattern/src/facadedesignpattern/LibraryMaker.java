package facadedesignpattern;
public class LibraryMaker {
    private Books book;
    private Students student;
    private Staff staff;
    
    public LibraryMaker()
    {
        book = new Books();
        student = new Students();
        staff = new Staff();
    }
    public void StudentMethod()
    {
        student.add();
    }
    public void BooksMethod()
    {
        book.add();
    }
    public void StaffMethod()
    {
        staff.add();
    }
}
