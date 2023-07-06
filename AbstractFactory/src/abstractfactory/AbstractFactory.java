package abstractfactory;
public abstract class AbstractFactory {
   abstract Employee getEmployee(String emp);
   abstract Worker getWorker(String worker);
}
