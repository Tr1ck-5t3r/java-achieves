package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class pell_rec
{
    int n,a,b;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter the no of terms");
        n=kb.nextInt();
        a=1;
        b=2;
    }
    public int pell(int i)
    {
        if(n>=i)
        {
            int c=0;
            if(i==1)
            c=1;
            else if(i==2)
            c=2;
            else
            {
                c=b*2+a;
                a=b;
                b=c;
            }
            System.out.print(c+",");
            return pell(i+1);
        }
        else
        return 1;
    }
    public void display()
    {
        pell(1);
    }
    public static void main(String arg[])
    {
        pell_rec o=new pell_rec();
        o.get();
        o.display();
    }
}