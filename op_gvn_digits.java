package tarun;

import java.util.*;
public class op_gvn_digits
{
    public static void main (String ar[])
    {
        int a[]=new int[10];
        int i,j,c,n=10,d,sum=0;
        char op;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter an operation + or -");
        op=kb.next().charAt(0);
        System.out.println("enter no of digits");
        d=kb.nextInt();
        int sel[]=new int[d];
        System.out.println("enter places");
        for(i=0;i<d;i++)
        sel[i]=kb.nextInt();
        if (op=='+')
        for(i=0;i<n;i++)
        {
            for(j=0;j<d;j++)
            if(i== sel[j])
            sum+=a[i];
        }
        else
        for(i=0;i<n;i++)
        {
            for(j=0;j<d;j++)
            if(i== sel[j])
            sum+=a[i];
        }
        System.out.println("sum is "+sum);
    }
}