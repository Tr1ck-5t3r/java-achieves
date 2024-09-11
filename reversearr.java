package tarun;

import java.util.*;
public class reversearr
{
    public static void main (String ar[])
    {
        int a[]=new int[10];
        int i,c,n=10;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        for(i=0;i<n/2;i++)
        {
            c=a[9-i];
            a[9-i]=a[i];
            a[i]=c;
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}