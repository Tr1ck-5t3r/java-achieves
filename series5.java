import java.util.*;
public class series5
{
    public static void main (String args[])
    {
        int no,i,sum=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<=no;i++)
        {
            if(i%2==0)
            sum+=i/i-1;
            else
            sum+=i/i+1;
        }
        System.out.println(sum);
        }
    }