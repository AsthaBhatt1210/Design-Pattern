package builderdesignforproject;
public class Bookbuilder {
     private int book_id;
     private String book_name;
     private String book_author;
     private String book_title;
     private String QR;
     private String book_issued; 
     private String book_returned;
     
     public Bookbuilder setbook_id(int book_id)
     {
         this.book_id = book_id;
         return this;
     }
     public Bookbuilder setbook_name(String book_name)
     {
         this.book_name = book_name;
         return this;
     }
     public Bookbuilder setbook_author(String book_author)
     {
         this.book_author = book_author;
         return this;
     }
     public Bookbuilder setbook_title(String book_title)
     {
         this.book_title = book_title;
         return this;
     }
     public Bookbuilder setQR(String QR)
     {
         this.QR = QR;
         return this;
     }
     public Bookbuilder setbook_issued(String book_issued)
     {
         this.book_issued = book_issued;
         return this;
     }
     public Bookbuilder setbook_returned(String book_returned)
     {
         this.book_returned = book_returned;
         return this;
     }
     public BuilderDesignforProject getBuilderDesignforProject()
     {
         return new BuilderDesignforProject(book_id,book_name,book_author,book_title,QR,book_issued,book_returned);
     }
}
