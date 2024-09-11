package tarun;

import java.util.*;
public class hcf
{
    int c,d,temp;
    public int hcf (int a,int b)
    {
        c=a;
        d=b;
        while(b != 0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[])
    {
        hcf o=new hcf();
        int a,b;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=kb.nextInt();
        b=kb.nextInt();
        int hcf=o.hcf(a,b);
        System.out.println("HCF is "+hcf);
    }
}