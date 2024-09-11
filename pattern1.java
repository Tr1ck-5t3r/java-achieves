package tarun;

import java.util.*;
public class pattern1
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
            System.out.print(j+" ");
            System.out.println();
        }
        }
}
       