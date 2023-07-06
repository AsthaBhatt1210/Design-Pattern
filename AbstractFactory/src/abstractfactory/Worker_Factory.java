package abstractfactory;
public class Worker_Factory extends AbstractFactory{

    @Override
    Employee getEmployee(String emp) {
        if(emp == null)
            return null;
        if(emp.equalsIgnoreCase("Employee_id"))
            return new Employee_id();
        else if(emp.equalsIgnoreCase("Employee_name"))
            return new Employee_name();
         throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    Worker getWorker(String worker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
