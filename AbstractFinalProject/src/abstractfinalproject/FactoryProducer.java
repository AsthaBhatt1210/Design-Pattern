package abstractfinalproject;
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Book"))
            return new BookFactory();
        else if(choice.equalsIgnoreCase("Student"))
            return new StudentFactory();
        return null;
    }
}
