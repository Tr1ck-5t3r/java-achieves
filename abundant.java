import java.io.*;
import java.util.*;
import java.lang.*;
public class abundant
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print abundant numbers within a range");
        System.out.println("Enter ranges where m<n");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,s=0,j;
        for (i=m;i<=n;i++)
        {
            s=0;
            for(j=1;j<i;j++)
            if(i%j==0)
            s+=j;
            if(s>i)
        System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        abundant o=new abundant ();
        o.get();
        o.print();
    }
}
