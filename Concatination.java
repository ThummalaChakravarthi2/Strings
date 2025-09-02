// Immutable String in java
import java.io.*;

class Geeks
{
    public static void main(String[] args)
    {
        String s = "Sachin";
    
        // concat() method appends the string at the end
        s.concat(" Tendulkar");
    
        // This will print Sachin because strings are immutable objects
        System.out.println(s);
    }
}
//Java program to assign the reference explicitly in String using String.concat() method

import java.io.*;

class Geeks
{
    public static void main(String[] args)
    {
        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);
    }
}
