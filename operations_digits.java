package tarun;

import java.util.*;
public class operations_digits
{
    public static void main (String ar[])
    {
        int a[]=new int[10];
        int i,c,n=10,sum=0;
        char op;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter an operation + or -");
        op=kb.next().charAt(0);
        if (op=='+')
        for(i=0;i<n;i++)
        sum+=a[i];
        else
        for(i=0;i<n;i++)
        sum-=a[i];
        System.out.println("sum is "+sum);
    }
}