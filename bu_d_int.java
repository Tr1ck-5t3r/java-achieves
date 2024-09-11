package tarun;

import java.util.*;
public class bu_d_int
{
    public static void main (String args[])
    {
        int a[]=new int[10];
        int i,j,k,m=0,ch;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 10 numbers ");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    ch=a[j+1];
                    a[j+1]=a[j];
                    a[j]=ch;
                }
            }
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}