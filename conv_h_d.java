package tarun;

import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_h_d
{
    String x;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a hexadecimal number");
        x=kb.next();
    }
    public void conv()
    {
        int i=0,n=x.length(),j=0,y,s=0;
        int cp[]=new int [100];
        for(i=0;i<n;i++)
        {
            if(Character.isDigit(x.charAt(i)))
            cp[i]=x.charAt(i)-48;
            else if (Character.isLetter(x.charAt(i)) && x.charAt(i)<='f')
            cp[i]=((int)x.charAt(i))-55;
        }
        for(i=0;i<n;i++)
        {
            y=cp[i];
        }        
        for(i=n-1,j=0;i>=0;i--,j++)
        {
            y=(int)Math.pow(16,j);
            s=s+(cp[i]*y);
        }
        System.out.println(s);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a hexadecimal number and print its decimal equivalent");
        conv_h_d o=new conv_h_d();
        o.get();
        o.conv();
    }
}
