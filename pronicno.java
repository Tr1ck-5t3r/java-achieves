import java.util.*;
public class pronicno
{
    public static void main (String args[])
    {
        int no,i,count=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<=no;i++)
        {
            if(i*i+1==no)
            {
                count++;
                break;
            }
        }
        if(count==1)
         System.out.println("Is a pronic no");
        else
        System.out.println("Is not a pronic no");
        }
}
      