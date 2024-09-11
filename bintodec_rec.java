package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class bintodec_rec
{
    int n;
    public int  get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("Enter the no");
        n=kb.nextInt();
        return n;
    }
    public void btd(int no)
    {
        if(no>0)
        {
            btd(no/2);
            System.out.print(no%2);
        }
    }
    public static void main(String args[])
    {
        bintodec_rec o=new bintodec_rec();
        int c=o.get();
        o.btd(c);
    }
}
