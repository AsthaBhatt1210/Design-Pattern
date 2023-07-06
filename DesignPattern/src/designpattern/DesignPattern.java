package designpattern;
class DesignPattern
{
 public static void main(String[] args)
 {
   Demo d1 = Demo.print(); 
   Demo d2 = Demo.print();
   System.out.println(d1.equals(d2));
 }
}

