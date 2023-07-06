package com.books;
public class FactoryBook 
{
    public Books getInstance(String s)
    {
        if(s.equals("Sbook"))
          return new Storybooks();
        else if(s.equals("Novel"))
           return new Novels();
        else 
            return new HorrorBooks();
     }
}
