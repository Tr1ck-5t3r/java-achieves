import java.util.*;
import java.math.*;
public class swap
{
    public static void main (String args[])
    {
        int a,b,c,max;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter values of a and b");
        a=kb.nextInt();
        b=kb.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
