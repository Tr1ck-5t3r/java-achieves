import java.util.*;
import java.lang.*;
import java.io.*;
public class conv_b_d
{
    long x;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a binary number");
        x=kb.nextLong();
    }
    public void conv()
    {
        int y,i=0,r;
        long cp=x,s=0;
        while(cp>0)
        {
            r=(int)cp%10;
            s+=r*((int)Math.pow(2,i));
            cp/=10;
            i++;
        }
        System.out.println(s);
    }
    public static void main(String args[])
    {
        System.out.println("program to get a binary number and print its decimal equivalent");
        conv_b_d o=new conv_b_d();
        o.get();
        o.conv();
    }
}
