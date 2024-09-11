package tarun;

import java.util.*;
import java.math.*;
public class niven_
{   
    int i,rem,sum=0,c=0;
    public void niven(int y)
    {
        int n=y;
        while (n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
    }
    public void disp(int y)
    {
        if(y%sum==0)
         System.out.println("Is a niven no");
        else
        System.out.println("Is not a niven no");
    }
    public static void main (String args[])
    {
        niven_ o=new niven_();
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        int no=kb.nextInt();
        o.niven(no);
        o.disp(no);
    }
}
       