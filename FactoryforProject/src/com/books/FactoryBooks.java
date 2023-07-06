package com.books;
public class FactoryBooks {
   public Books getInstance(String s)
   {
       if(s.equals("CS"))
          return new CSBooks();
        else if(s.equals("EC"))
           return new ECBooks();
        else 
            return new ICTBooks();
   }
}
