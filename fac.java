import java.util.*;
import java.math.*;
public class fac
{   public static void main (String args[])
    {
        int no,i,rem=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        System.out.println("factors are");
        for(i=1;i<=no;i++)
        {
            if(no%i==0)
            System.out.println(i);
        }
    }
}
       