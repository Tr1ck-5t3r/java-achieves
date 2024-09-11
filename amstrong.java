import java.util.*;
public class amstrong 
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
    public void amstrong(int y)
    {
        int n,rem;
        n=y;
        for(int i=1;i<=c;i++)
        {
            rem=n%10;
            sum+=Math.pow(rem,c);
            n=n/10;
        }
    }
    public void disp(int y)
        {
        if(sum==y)
         System.out.println("Is a amstrong no");
        else
        System.out.println("Is not a amstrong no");
    }
      public static void main(String args[])
    {
        amstrong o=new amstrong();
        int str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        str=kb.nextInt();
        o.count(str);
        o.amstrong(str);
        o.disp(str);
    }
}

    