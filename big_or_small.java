import java.lang.*;
import java.util.*;
public class big_or_small
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner Kb=new Scanner(System.in);
        System.out.println("enter value of a");
        a=Kb.nextInt();
        System.out.println("enter value of b");
        b=Kb.nextInt();
        System.out.println("enter 1 for smallest or 2 for biggest");
        c=Kb.nextInt();
         if(c==1)
         {
            if (a<b)
            {
            System.out.println("a is smaller than b");
            }
            else if (a>b)
            {
             System.out.println("b is smaller than ");
            }
        }
         else if (c==2)
         {
             if (b<a)
            {
            System.out.println("a is bigger than b");
            }
            else if (b>a)
            {
            System.out.println("b is bigger than a");
            }
         }
    }
}

