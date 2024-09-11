import java.io.*;
import java.util.*;
import java.lang.*;
public class amicable
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to get 2 numbers and print if they are amicable");
        System.out.println("Enter 2 numbers");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,j,s1=0,s2=0;
        for (j=1;j<(n/2+1);j++)
        {
            if(n%j==0)
            s1+=j;
        }   
        for (j=1;j<(m/2+1);j++)
        {
            if(m%j==0)
            s2+=j;
        }
        if(s1==m &&s2==n )
        System.out.println("they are amicable");
        
    }
    public static void main (String args[])
    {
        amicable o=new amicable ();
        o.get();
        o.print();
    }
}
