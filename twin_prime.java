package tarun;

import java.util.*;
public class twin_prime
{
    int c2,c1,d;
    public void twin(int n1,int n2)
    {
        int i;
        for(i=1;i<n1;i++)
        
        if(n1%i==0)
        c1++;
        for(i=1;i<n2;i++)
         if(n2%i==0)
        c2++;
        d=(n2>n1)?n2-n1:n1-n2;
    }
    public void display()
    {
        if((c2==1)&&(c1==1)&&(d==2))
        System.out.println("they are twin prime nos");
        else
        System.out.println("they are not twin prime nos");
    }
      public static void main(String args[])
    {
        twin_prime o=new twin_prime();
        int a,b;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=kb.nextInt();
        b=kb.nextInt();
        o.twin(a,b);
        o.display();
    }
}