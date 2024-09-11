package tarun;

import java.util.*;
public class type_of_no
{
    public void type(int n)
    {
        int i,c=0;
        for(i=1;i<n;i++)
        if(n%i==0)
        c+=1;
        if(n==1)
        System.out.println("It is a unique no");
        else  if(c==1)
        System.out.println("It is a prime no");
        else 
        System.out.println("It is a composite no");
    }
    public static void main(String a[])
    {
        type_of_no o=new type_of_no();
        int no;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a nos");
        no=kb.nextInt();
        o.type(no);
    }
}