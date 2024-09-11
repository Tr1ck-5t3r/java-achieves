import java.util.*;
import java.lang.*;
 public class toss 
{
    public static void main (String args[])
    {
        long i,no,n;
        Scanner kb =new Scanner(System.in);
        System.out.println("enter no of chances");
        n=kb.nextInt();
        for(i=0;i<n;i++)
        {
            no=(int)(Math.random()*2)+1;
            System.out.println("NO  is "+no);
        }
    }
}
