package tarun;

import java.lang.*;
import java.util.*;
public class area_isoceles
{
    public static void main(String args[])
    {
       int a,b;
       double ae;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate area of a right triangle");
       System.out.println("enter a side");
       a=Kb.nextInt();
       System.out.println("enter the equal side");
       b=Kb.nextInt();
       ae=b*Math.sqrt((4*a*a)-(b*b));
       System.out.println("area is"+ae);
           
    }
}
