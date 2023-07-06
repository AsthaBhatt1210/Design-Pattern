/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypractice;

/**
 *
 * @author hp
 */
public class FactoryPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoryProducer ob = new FactoryProducer();
        Interfaceclass ob1 = ob.getInstance("class1");
        ob1.show();
    }
    
}
