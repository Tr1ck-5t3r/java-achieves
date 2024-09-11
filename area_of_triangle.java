import java.lang.*;
import java.util.*;
public class area_of_triangle
{
    public static void main(String args[])
    {
       int s1,s2;
       double ae;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate area of a right triangle");
       System.out.println("enter a side");
       s1=Kb.nextInt();
       System.out.println("enter a side");
       s2=Kb.nextInt();
       ae=(s1*s2)/2;
       System.out.println("area is"+ae);
           
    }
}
