import java.util.*;
public class gcd
{
    int c,d,temp;
    public int gcd (int a,int b)
    {
        int i,s,g=1;
        s=(a>b)?a:b;
        for (i=1;i<s;i++)
        if(a%i==0 && b%i==0)
        g=i;
        return g;
    }
    public static void main(String args[])
    {
        gcd o=new gcd();
        int a,b;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=kb.nextInt();
        b=kb.nextInt();
        int gcd=o.gcd(a,b);
        System.out.println("GCD is "+gcd);
    }
}