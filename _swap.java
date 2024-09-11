import java.util.*;
import java.math.*;
public class _swap
{
    public static void main (String args[])
    {
        int a,b,max;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter values of a and b");
        a=kb.nextInt();
        b=kb.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
