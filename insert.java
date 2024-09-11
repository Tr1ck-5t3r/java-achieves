package tarun;

import java.util.*;
public class insert
{
    public static void main (String ae[])
    { 
        int i,p=0,n0,ch=0;
        int n=10;
        int a[]=new int[1000];
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<n;i++)
        a[i]=kb.nextInt();
        System.out.println("enter a NUMBER to be entered");
        n0=kb.nextInt();
        System.out.println("enter its position to be entered");
        p=kb.nextInt();        
        n=n+1;
        for(i=n-2;i>=p;i--)
        {
            a[i+1]=a[i];
            ch=ch+1;
        }
        a[p]=n0;
        for(i=0;i<=11;i++)
        System.out.print(a[i]+" ");
    }
}