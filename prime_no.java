import java.util.*;
import java.math.*;
public class prime_no
{   public static void main (String args[])
    {
        int no,i,rem=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<no;i++)
        {
            if(no%i==0)
            rem=rem+1;
        }
        if(rem!=1)
         System.out.println("Is a prime no");
        else
        System.out.println("Is not a prime no");
        }
}
       