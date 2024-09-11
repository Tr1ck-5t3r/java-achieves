package tarun;

import java.lang.*;
import java.util.*;
public class type_of_triangle
{
    public static void main(String args[])
    {
       int s1,s2,s3;
       double ae;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate area of a right triangle");
       System.out.println("enter a side");
       s1=Kb.nextInt();
       System.out.println("enter another side");
       s2=Kb.nextInt();
       System.out.println("enter another side");
       s3=Kb.nextInt();
       if(s1==s2 && s2==s3 && s1==s3)
       System.out.println("It is a equilateral triangle");
       else if(s1==s2 || s2==s3||s1==s3)
       System.out.println("It is a isoceles triangle");
       else
       System.out.println("It is a scalene triangle");
    }
}
