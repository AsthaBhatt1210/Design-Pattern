package agriculture;
public class BuilderDesign {
    
    //Declaration
    private String crops;
    private String pests;
    private int stock;
    private double temp;
    private int buy_rate;
    
    //Constructor with the parameters
    public BuilderDesign(String crops,String pests,int stock,double temp,int buy_rate)
    {
        super();
        this.crops = crops;
        this.pests = pests;
        this.stock = stock;
        this.temp = temp;
        this.buy_rate = buy_rate;
    }
    //This method display the output on screen
    public String toString()
    {
        return "Crops = " +crops+ ", Pests = " +pests+ ", Stock = " +stock+ ", Temp = " +temp+ ", Buy_rate = " +buy_rate;
    }
}
