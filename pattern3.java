package tarun;

import java.util.*;
public class pattern3
{
    public static void main (String args[])
    {
        int no,i,count=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<=no;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("* ");
                else
                System.out.print("# ");            
            }
            System.out.println();
        }
        }
}
       