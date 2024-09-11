package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class fibbonacci
{
    public int fibbo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return (fibbo(n-1)+fibbo(n-2));
    }
    public void display(int n)
    {
        int c=fibbo(n);
        System.out.println("fibbonacci no is: "+c);        
    }
    public static void main(String asads[])
    {
        Scanner kb=new Scanner (System.in);
        fibbonacci o=new fibbonacci();
        System.out.println("enter a no");
        o.display(kb.nextInt());
    }
}
