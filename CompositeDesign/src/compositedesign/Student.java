package compositedesign;
public class Student implements Library {
    private String student_name;
    private long student_id;
    
    public Student(long student_id,String student_name)
    {
     this.student_id=student_id;
     this.student_name=student_name;
    }
    @Override
    public void showLibraryDetails() {
       System.out.println("Students: " + student_id+ " " +student_name);
    }
}
