import java.util.*;
import java.math.*;
public class test
{
    public static void main (String args[])
    {
        int a,b,c,s1,s2;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=kb.nextInt();
        b=kb.nextInt();
        c=kb.nextInt();
        s1=a<<=1;
        s2=b>>>=2;
        System.out.println(s1+" " +s2);
    }
}