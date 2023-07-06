package abstractfinalproject;
public class StudentFactory extends AbstractFactory{
    @Override
    BookInterface getBook(String book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    StudentInterface getStudent(String student) {
       if(student == null)
            return null;
        if(student.equalsIgnoreCase("student_enroll"))
           return new Student_Enroll();
         else if(student.equalsIgnoreCase("student_issued"))
           return new Student_Issuedate();
        return null;
    }
 }
