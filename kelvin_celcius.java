
import java.util.*;
public class kelvin_celcius
{
    public static void main(String args[])
    {
        int b,t,c,k;
        Scanner Kb=new Scanner (System.in);
        System.out.println("enter the temperatur in celcius or kelvin");
        t=Kb.nextInt();   
        System.out.println("enter 1 for temperature in celcius,2 for temperature in kelvin");
        b=Kb.nextInt();
        if (b==2)
        {
            k=t+273;
            System.out.println("the temperature in kelvin is "+k);
        }
        else
        {
            c=t-273;
            System.out.println("the temperature in celcius is "+c);
        }
     }
}

