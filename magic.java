import java.io.*;
import java.util.*;
import java.lang.*;
public class magic
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print magic numbers within a range");
        System.out.println("Enter ranges where m<n");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,s=0,j,cp,r;
        for (i=m;i<=n;i++)
        {
            cp=i;
            do
            {
                s=0;
                r=0;
                do
                {
                    r=cp%10;
                    s=s+r;
                    cp/=10;
                }while (cp>0);
                cp=s;
            }while(s>9);
            if(s==1)
            System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        magic o=new magic ();
        o.get();
        o.print();
    }
}
