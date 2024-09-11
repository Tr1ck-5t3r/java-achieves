package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class rep_no
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=kb.nextInt();
        int i,j,s=0,k;
        boolean t=false;
        int a[]=new int [n];
        for(i=1;i<n;i++)
        {
            t=false;
            s=0;
            for(j=i;j<n;j++)
            {
                s+=j;
                if(s==n)
                {
                    t=true;
                    break;
                }
                if(s>n)
                break;
            }
            if(t==true)
            {
            for(k=i;k<=j;k++)
            System.out.print(k+" ");
            System.out.println();
            }
        }
    }
}