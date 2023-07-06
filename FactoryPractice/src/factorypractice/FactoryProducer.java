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
public class FactoryProducer {
    public Interfaceclass getInstance(String s)
    {
        if(s.equals("class1"))
            return  new class1();
        else
            return new class2();
    }
    
}
