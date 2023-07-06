package decoratordp;
public class AddBooks implements Library {
    protected Library book;
    
    public AddBooks(Library book)
    {
        this.book = book;
    }
    @Override
    public void add() {
       book.add();
    }
}
