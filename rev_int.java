package tarun;

import java.util.*;
public class rev_int
{
    public void rev_int(int x)
    {
        int n=x,rem,sum=0,c=0;
        while(n> 0)
        {
            rem=n%10;
            n/=10;
            c++;
        }
        n=x;
        for(int i=1;i<=c;i++)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
      public static void main(String args[])
    {
        rev_int o=new rev_int();
        int str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        str=kb.nextInt();
        o.rev_int(str);
    }
}
