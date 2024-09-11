//to generate numbers for a game of dice
import java.util.*;
 public class dice 
{
    public static void main (String ar[])
    {
        int no,n;
        Scanner kb =new Scanner(System.in);
        System.out.println("enter no of chances");
        n=kb.nextInt();
        for (int i=1;i<n;i++)
        {
            no=(int)((Math.random()*6)+1);
            System.out.println(no);
        }
    }
}
