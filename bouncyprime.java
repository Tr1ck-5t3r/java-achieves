package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class bouncyprime
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print bouncy prime numbers within a range");
        System.out.println("Enter ranges where m<n,m,n>100");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,s1,s2,j,cp,r,c=0,no;
        int a[]=new int [1000];
        for (i=m;i<=n;i++)
        {
            cp=i;
            j=0;
            s1=0;
            s2=0;
            c=0;
            while (cp>0)
            {
                r=cp%10;
                a[j]=r;
                cp/=10;
                j++;
            }
            no=j;
            for(j=1;j<no;j++)
            {
                if(a[j]>a[j-1])
                {
                    s1++;
                }
                if(a[j]<a[j-1])
                {
                    s2++;
                }
            }
            for (j=1;j<i;j++)
            {
                if(i%j==0)
                c++;
                if (c>3)
                break;
            }
            if((s1!=no || s2!=no) && c==1 )
            System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        bouncyprime o=new bouncyprime ();
        o.get();
        o.print();
    }
}
