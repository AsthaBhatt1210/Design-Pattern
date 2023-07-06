package builderdesignforproject;
public class BuilderDesignforProject 
{
     private int book_id;
     private String book_name;
     private String book_author;
     private String book_title;
     private String QR;
     private String book_issued; 
     private String book_returned;
     
     public BuilderDesignforProject(int book_id,String book_name,String book_author,String book_title,String QR,String book_issued,String book_returned)
    {
        super();
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_title = book_title;
        this.QR = QR;
        this.book_issued = book_issued;
        this.book_returned = book_returned;
    }
     public String toString()
    {
        return "Book_id= " +book_id+ " ,Book_name= " +book_name+ " ,Book_author= " +book_author+ " ,Book_title= " +book_title+ " ,QR= " +QR+ " ,Book_issued= " +book_issued+ " ,Book_returned= " +book_returned+ "";
    }
}
