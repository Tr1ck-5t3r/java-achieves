package tarun;

import java.io.*;
import java.lang.*;
import java.util.*;
public class conv_d_b
{
    long x;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a decimal number");
        x=kb.nextLong();
    }
    public void conv()
    {
        long r,cp=x,s=0;
        int i=0,y;
        long ar[]=new long[100];
        while(cp>0)
        {
            ar[i]=cp%2;
            cp/=2;
            i++;
        }
        y=i;
        for(i=0;i<y;i++)
        r=ar[i];
        
        for(i=y-1;i>=0;i--)
        {
            s=(s*10)+ar[i];
        }
        System.out.println(s);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a decimal number and print its binary equivalent");
        conv_d_b o=new conv_d_b();
        o.get();
        o.conv();
    }
}