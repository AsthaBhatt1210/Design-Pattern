package compositedesign;
public class Book_shelf implements Library {
    private String shelf_QR;
    private long shelf_id;
    
    public Book_shelf(long shelf_id,String shelf_QR)
    {
        this.shelf_id=shelf_id;
        this.shelf_QR=shelf_QR;
    }
    @Override
    public void showLibraryDetails() {
       System.out.println("Book_shelf: " + shelf_id+ " " +shelf_QR);
    }
}
