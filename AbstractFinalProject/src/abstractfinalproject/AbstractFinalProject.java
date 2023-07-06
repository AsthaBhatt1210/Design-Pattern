package abstractfinalproject;
class AbstractFinalProject {
  public static void main(String[] args) {
         AbstractFactory ob = FactoryProducer.getFactory("Book");
         BookInterface b1 = ob.getBook("Book_details");
         b1.book();
        }
 }
/*      AbstractFactory ob = FactoryProducer.getFactory("Student");
        StudentInterface b1 = ob.getStudent("Student_Issuedate");
        b1.student(); */