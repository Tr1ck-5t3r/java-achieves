package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class disarium
{
    public static void main (String args[])
    {
        int n,m,c,i,b,a,s=0;
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print disarium numbers within a range");
        System.out.println("Enter ranges where m<n where m,n are 3 digit nos");
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println(" disarium numbers are ");
        for (i=m;i<=n;i++)
        {
            a=i/100;
            b=(i/10)%10;
            c=i%10;
            s=(a)+(b*b)+(c*c*c);
            if(s==i)
            System.out.println(s);
        }
    }
}
