package designpattern;
public class Demo 
{
   private static Demo obj;
   private Demo()
   {
     System.out.println("This is Demo Class");
   }
   public static Demo print()
   {
     if(obj == null)
     {
         obj = new Demo();
     }
     return obj;
   }
}
