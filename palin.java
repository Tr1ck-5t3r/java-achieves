import java.util.*;
public class palin 
{
    int sum=0,c=0;
    public void count(int y)
    {
        int n=y,rem;
        while(n> 0)
        {
            rem=n%10;
            n/=10;
            c++;
        }
    }
    public void palin(int y)
    {
        int n,rem;
        n=y;
        for(int i=1;i<=c;i++)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
    }
    public void disp(int y)
        {
        if(sum==y)
         System.out.println("Is a palindrome");
        else
        System.out.println("Is not a palindrome");
    }
      public static void main(String args[])
    {
        palin o=new palin();
        int str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        str=kb.nextInt();
        o.count(str);
        o.palin(str);
        o.disp(str);
    }
}
