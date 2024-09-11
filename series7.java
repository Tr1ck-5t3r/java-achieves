package tarun;

import java.util.*;
public class series7
{
    public static void main (String args[])
    {
        int no,i,sum=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        for(i=1;i<=no;i++)
        {
            if(i%2!=0)
            sum+=i/Math.pow(i,i);
            else
            sum-=i/Math.pow(i,i);
        }
        System.out.println(sum);
        }
    }