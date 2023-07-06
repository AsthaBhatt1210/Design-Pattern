package agriculture;
public class Agriculture {
    public static void main(String[] args) {   
        //Assign the values using set method
          BuilderDesign ob1 = new AgricultureBuilder().setcrops("Rise").setpests("Deet").setstock(12).settemp(1.1).setbuy_rate(98).getBuilderDesign();
          BuilderDesign ob2 = new AgricultureBuilder().setcrops("Pulse").setpests("Malathoin").setstock(13).settemp(12.1).setbuy_rate(23).getBuilderDesign();
          BuilderDesign ob3 = new AgricultureBuilder().setcrops("Oil seeds").setpests("DDT").setstock(9).settemp(1.15).setbuy_rate(90).getBuilderDesign();
          System.out.println(ob1);
          System.out.println(ob2);
          System.out.println(ob3);
    }
}
