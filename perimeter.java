import java.util.*;
import java.lang.*;
public class perimeter
{
    public static void main(String args[])
    {
       int a,b,c,d,e,f,g,h,pe,ae;
       Scanner Kb=new Scanner (System.in);
       System.out.println("this program is to calculate perimeter of a ouadrilateral");
       System.out.println("enter 1(square)or 2(rectangle)or 3(uneven sides)");
       b=Kb.nextInt();
       switch(b)
       {
           case 1:
           System.out.println("enter a side");
           d=Kb.nextInt();
           pe=4*d;
           System.out.println("perimeter is"+pe);
           break;
           case 2:
           System.out.println("enter a side");
           d=Kb.nextInt();
           System.out.println("enter adjacent side");
           e=Kb.nextInt();
           pe=2*(d+e);
           System.out.println("perimeter is"+pe);
           break;
           case 3:
           System.out.println("enter a side");
           d=Kb.nextInt();
           System.out.println("enter adjacent side");
           e=Kb.nextInt();
           System.out.println("enter adjacent side");
           f=Kb.nextInt();
           System.out.println("enter adjacent side");
           g=Kb.nextInt();
           pe=d+e+f+g;
           System.out.println("perimeter is"+pe);
       }
    }
}
