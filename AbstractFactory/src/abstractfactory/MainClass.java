package abstractfactory;
public class MainClass {
    public static void main(String args[])
    {
         AbstractFactory ob = FactoryProducer.getFactory("Worker");
         Worker b1 = ob.getWorker("Worker_id");
         b1.worker();
    }
}
