package builderdesignforproject;
public class Book {
    public static void main(String args[])
    {
     BuilderDesignforProject ob = new Bookbuilder().setbook_id(1).setbook_name("DS").setbook_author("Reema Thareja").setbook_title("DSA Concepts").setbook_issued("12/1").setbook_returned("12/3").getBuilderDesignforProject();
     System.out.println(ob);
    }
}
