import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_b_o
{
    String x;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a binary number");
        x=kb.next();
    }
    public void conv()
    {
        int i=0,n=x.length(),j=0,y=0;
        String s;
        String a[]={"000","001","010","011","100","101","110","111"};
        for(i=0;i<n;i+=3)
        {
            s=x.substring(i,i+3);
            for(j=0;j<8;j++)
            if(s.compareTo(a[j])==0)
            break;
            y=(y*10)+j;
        }
        System.out.println(y);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a binary number and print its octal equivalent");
        conv_b_o o=new conv_b_o();
        o.get();
        o.conv();
    }
}
