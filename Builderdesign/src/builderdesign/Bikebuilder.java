package builderdesign;
public class Bikebuilder {
    
    private String name;
    private int speed;
    private int average;
    private double rate;
    private int battery;
    
    public Bikebuilder setName(String name)
    {
        this.name = name;
        return this;
    }
    public Bikebuilder setSpeed(int speed)
    {
        this.speed = speed;
        return this;
    }
    public Bikebuilder setAverage(int average)
    {
        this.average = average;
        return this;
    }
    public Bikebuilder setRate(double rate)
    {
        this.rate = rate;
        return this;
    }
    public Bikebuilder setBattery(int battery)
    {
        this.battery = battery;
        return this;
    }
    public Builderdesign getBuilderdesign()
    {
       return new Builderdesign(name,speed,average,rate,battery);
    }
}
