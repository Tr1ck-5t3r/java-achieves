package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class karpekar
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the range");
        int p=kb.nextInt();
        int q=kb.nextInt();
        int i,j,k=0,l,n1,n2;
        boolean c;
        char c1,c2;
        if(p>q )
        System.out.println("invalid range ");
        else
        {
            System.out.println("the karpekar numbers are ");
            for(i=p;i<=q;i++)
            {
                String s=Integer.toString(i*i);
                l=s.length();
                if(i*i>9)
                {
                n1=Integer.parseInt(s.substring(0,l/2));
                n2=Integer.parseInt(s.substring(l/2,l));
                if(n1+n2==i)
                {
                System.out.println(i);
                k++;
                }
                }
            }
            System.out.println("the no of karpekar numbers is "+k);
        }
    }
}
                   