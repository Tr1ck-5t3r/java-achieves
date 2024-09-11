import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_o_b
{
    long x;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a octal number");
        x=kb.nextLong();
    }
    public void conv()
    {
        int y,n=0,i=0;
        long cp=x;
        int c[]=new int [100];
        String st="",a[]={"000","001","010","011","100","101","110","111"};
        while (cp>0)
        {
            c[i]=(int)cp%10;
            i++;
            cp/=10;
        }
        n=i;
        for(i=n-1;i>=0;i--)
        {
            y=c[i];
            st+=a[y];
        }
        System.out.println(st);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a octal number and print its binary equivalent");
        conv_o_b o=new conv_o_b();
        o.get();
        o.conv();
    }
}
