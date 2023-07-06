package abstractfactory;
public class FactoryProducer {
 public static AbstractFactory getFactory(String choice)
 {
     if(choice.equalsIgnoreCase("Worker"))
         return new Worker_Factory();
     else if(choice.equalsIgnoreCase("Employee"))
         return new Employee_Factory();
     return null;
 }
}
