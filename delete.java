package tarun;

import java.util.*;
public class delete
{
    public static void main (String argxcgh[])
    { 
        int a[]=new int[10];
        int i,pos=0,name,ch,n=10;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter a no to be deleted");
        name=kb.nextInt();
        System.out.println("enter its position to be deleted");
        pos=kb.nextInt();
        for(i=pos+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        n--;
        for(i=0;i<9;i++)
        System.out.print(a[i]+" ");
    }
}
