package builderdesign;

public class Builderdesign
{
    private String name;
    private int speed;
    private int average;
    private double rate;
    private int battery;
    
    public Builderdesign(String name,int speed,int average,double rate,int battery)
    {
        super();
        this.name = name;
        this.speed = speed;
        this.average = average;
        this.rate = rate;
        this.battery = battery;
        
    }
    public String toString()
    {
        return "Name= " +name+ " ,Speed= " +speed+ " ,Average= " +average+ " ,Rate= " +rate+ " ,Battery= " +battery+ "";
    }
}
