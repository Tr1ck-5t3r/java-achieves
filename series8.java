package tarun;

import java.util.*;
public class series8
{
    public static void main (String args[])
    {
        int no,i,sum=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<=no;i++)
        sum+=i/Math.pow(i,2*i);
        System.out.println(sum);
    }
}