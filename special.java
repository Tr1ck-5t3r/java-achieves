package tarun;

import java.util.*;
public class special
{
    int sum=0,c=0;
    public void special(int y)
    {
        int n,rem,fact=1;
        n=y;
        while(n> 0)
        {
          rem=n%10;
          for(int a=1;a<=rem;a++)
          fact*=a;
          sum+=fact;
          fact=1;
          n/=10;
        }
        System.out.println(sum);      
    }
    public void disp(int y)
        {
        if(sum==y)
         System.out.println("Is a special no");
        else
        System.out.println("Is not a special no");
    }
      public static void main(String args[])
    {
        special o=new special();
        int str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        str=kb.nextInt();
        o.special(str);
        o.disp(str);
    }
}
