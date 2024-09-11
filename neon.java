import java.util.*;
public class neon
{
    int sum=0,c=0;
    public void count(int y)
    {
        int n=y,rem;
        int s=n*n;
        while(s> 0)
        {
            rem=s%10;
            s/=10;
            c++;
        }
    }
    public void neon(int y)
    {
        int n,rem;
        n=y;
        int s=n*n;
        while(s> 0)
        {
            rem=s%10;
            sum+=rem;
            s/=10;
        }
    }
    public void disp(int y)
        {
        if(sum==y)
         System.out.println("Is a neon no");
        else
        System.out.println("Is not a neon no");
    }
      public static void main(String args[])
    {
        neon o=new neon();
        int str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        str=kb.nextInt();
        o.count(str);
        o.neon(str);
        o.disp(str);
    }
}
