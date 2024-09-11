package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class conv_h_b
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
        String a[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        String st="";
        for(i=0;i<n;i++)
        {
            if(Character.isDigit(x.charAt(i)))
            cp[i]=((int)x.charAt(i))-48;
            else if (Character.isLetter(x.charAt(i)) && x.charAt(i)<='f')
            cp[i]=((int)x.charAt(i))-55;
        }
        for(i=0;i<n;i++)
        {
            y=cp[i];
            st+=a[y];
        }
        System.out.println(st);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a hexdecimal number and print its binary equivalent");
        conv_h_b o=new conv_h_b();
        o.get();
        o.conv();
    }
}
