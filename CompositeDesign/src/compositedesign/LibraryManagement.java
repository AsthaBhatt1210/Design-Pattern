package compositedesign;
import java.util.ArrayList;
import java.util.List;
public class LibraryManagement implements Library{
    private List<Library> LibraryList = new ArrayList<Library>();
    @Override
    public void showLibraryDetails() {
       for(Library lib:LibraryList)
       {
            lib.showLibraryDetails();
       }
    } 
    public void addLibrary(Library lib)
    {
        LibraryList.add(lib);
    }
    public void removeLibrary(Library lib)
    {
        LibraryList.remove(lib);
    }
}
