package builderdesign;
public class Bike {
    public static void main(String args[])
    {
        //Builderdesign ob = new Builderdesign("Royal Enfield",60,45,12.12,85);
        Builderdesign ob = new Bikebuilder().setName("Royal").setSpeed(60).setAverage(23).setRate(12.78).setBattery(85).getBuilderdesign();
        System.out.println(ob);
    }
 }
