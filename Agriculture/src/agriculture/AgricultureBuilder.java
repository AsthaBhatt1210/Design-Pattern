package agriculture;
public class AgricultureBuilder {
    
    //Declaration
    private String crops;
    private String pests;
    private int stock;
    private double temp;
    private int buy_rate;
    
    //Use of set method -> to set the values
    public AgricultureBuilder setcrops(String crops)
    {
        this.crops = crops;
        return this;
    }
    public AgricultureBuilder setpests(String pests)
    {
        this.pests = pests;
        return this;
    }
    public AgricultureBuilder setstock(int stock)
    {
        this.stock = stock;
        return this;
    }
    public AgricultureBuilder settemp(double temp)
    {
        this.temp = temp;
        return this;
    }
    public AgricultureBuilder setbuy_rate(int buy_rate)
    {
        this.buy_rate = buy_rate;
        return this;
    }
    //create the method of BuilderDesign class
    public BuilderDesign getBuilderDesign()
    {
        return new BuilderDesign(crops,pests,stock,temp,buy_rate);
    }
}
