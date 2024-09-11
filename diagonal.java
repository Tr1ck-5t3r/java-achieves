package tarun;

import java.lang.*;
import java.util.*;
public class diagonal
{
    public static void main(String args[])
    {
       int s1,s2;
       double d;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate area of a right triangle");
       System.out.println("enter a side");
       s1=Kb.nextInt();
       System.out.println("enter a side");
       s2=Kb.nextInt();
       d=Math.sqrt((s1*s1)+(s2*s2));
       System.out.println("diagonal is "+d);
           
    }
}
