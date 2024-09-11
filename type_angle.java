import java.lang.*;
import java.util.*;
public class type_angle
{
    public static void main(String args[])
    {
       int a;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate area of a right triangle");
       System.out.println("enter an angle");
       a=Kb.nextInt();
       if(a<90)
       System.out.println("It is an acute angle");
       else if(a==90)
       System.out.println("It is an right angle");
       else if(a>90)
       System.out.println("It is an obtuse angle");
       else
       System.out.println("It is a straight angle");
    }
}
