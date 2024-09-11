import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_b_h
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
        int i=0,n=x.length(),j=0;
        char c=' ';
        String s="",st;
        String a[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        for(i=0;i<n;i+=4)
        {
            st=x.substring(i,i+4);
            for(j=0;j<15;j++)
            if(st.compareTo(a[j])==0)
            break;
            if(j>=10)
            c=(char)(j+55);
            else if(j<=9)
            c=(char)(j+48);
            s+=c;
        }
        System.out.println(s);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a binary number and print its hexacimal equivalent");
        conv_b_h o=new conv_b_h();
        o.get();
        o.conv();
    }
}
