package tarun;

import java.util.*;
public class celcius_farenheit
{
    public static void main(String args[])
    {
        int b,t,c,f;
        Scanner Kb=new Scanner (System.in);
        System.out.println ("enter the temperature in Celsius or Fahrenheit");
        t=Kb.nextInt();   
        System.out.println("enter 1 for temperature in Celsius, 2 for temperature in Fahrenheit");
        b=Kb.nextInt();
        switch(b)
        {
            case 1:
            f=(t*9/5)+32;
            System.out.println("the temperature in Farenheit is "+f);
            break;
            case 2:
            c=(t*5/9)-32;
            System.out.println("the temperature in Celsius is "+c);
            break;
        } 
     }
}
