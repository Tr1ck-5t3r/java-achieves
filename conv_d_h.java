import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_d_h
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
        String st="";
        char c;
        long r,cp=x;
        int i=0,y,j;
        long a[]=new long[100];
        while(cp>0)
        {
            a[i]=cp%16;
            cp/=16;
            i++;
        }
        y=i;
        for (i=0;i<=y;i++)
        {
            if(a[i]>=10)
            a[i]=a[i]+55;
            else
            a[i]=a[i]+48;          
        }
        for(i=y-1;i>=0;i--)
        {
            st+=(char)a[i];
        }
        System.out.println(st);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a decimal number and print its hexadecimal equivalent");
        conv_d_h o=new conv_d_h();
        o.get();
        o.conv();
    }
}

