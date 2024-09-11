import java.io.*;
import java.util.*;
import java.lang.*;
public class emirp
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print emirp numbers within a range");
        System.out.println("Enter ranges where m<n");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,s=0,j,cp,r,c1=0,c2=0;
        for (i=m;i<=n;i++)
        {
            cp=i;
            c1=0;
            c2=0;
            s=0;
            r=0;
            while (cp>0)
            {
                r=cp%10;
                s=(s*10)+r;
                cp/=10;
            }
            for (j=1;j<i;j++)
            {
                if(i%j==0)
                c1++;
            }   
            for (j=1;j<i;j++)
            {
                if(s%j==0)
                c2++;
            }   
            if(c1==1 && c2==1 && i!=s)
            System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        emirp o=new emirp ();
        o.get();
        o.print();
    }
}
