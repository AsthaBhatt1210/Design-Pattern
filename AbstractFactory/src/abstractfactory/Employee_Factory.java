package abstractfactory;

/**
 *
 * @author hp
 */
public class Employee_Factory extends AbstractFactory{

    @Override
    Employee getEmployee(String emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Worker getWorker(String worker) {
        
        if(worker == null)
            return null;
        if(worker.equalsIgnoreCase("Worker_id"))
            return new Worker_id();
        else if(worker.equalsIgnoreCase("Worker_Categories"))
            return new Worker_Categories();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
