package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class hailstone_rec
{
    int n;
    public int  get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a no");
        n=kb.nextInt();
        return n;
    }
    public void hail(int no)
    {
        if(no>0)
        {
            if(no==1)
            System.out.print(no+".");
            else if (no%2==0)
            {
                System.out.print(no+",");
                hail(no/2);
            }
            else
            {
                System.out.print(no+",");
                hail(no*3+1);
            }
        }
    }
    public static void main(String ag[])
    {
        hailstone_rec o=new hailstone_rec();
        int v=o.get();
        o.hail(v);
    }
}
