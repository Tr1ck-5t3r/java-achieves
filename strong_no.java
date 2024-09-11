import java.io.*;
import java.util.*;
import java.lang.*;
public class strong_no
{
    int m,n;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print strong numbers within a range");
        System.out.println("Enter ranges where m<n");
        m=kb.nextInt();
        n=kb.nextInt();
    }
    public void print()
    {
        int i,s=1,j,cp=0,c,r=0;
        for (i=m;i<=n;i++)
        {
            c=i;
            r=0;
            cp=0;
            while (c>0)
            {
                s=1;
                r=c%10;
                for (j=1;j<=r;j++)
                {
                    s*=j;
                }
                cp+=s;
                c/=10;
            }
            if(cp==i)
            System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        strong_no o=new strong_no();
        o.get();
        o.print();
    }
}
