package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class daydiff
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of date on which difference is to be found");
        System.out.println("date 1 ");
        System.out.println("day ");
        int d1=kb.nextInt();
        System.out.println("month ");
        int m1=kb.nextInt();
        System.out.println("year ");
        int y1=kb.nextInt();
        System.out.println("date 2 ");
        System.out.println("day ");
        int d2=kb.nextInt();
        System.out.println("month ");
        int m2=kb.nextInt();
        System.out.println("year ");
        int y2=kb.nextInt();
        int n1=0,n2=0,no=0,i;
        int nod1[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int nod2[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y1%4==0)
        nod1[1]=29;
        if(y2%4==0)
        nod2[1]=29;
        if(y1<=y2)
        {
            for(i=0;i<m1-2;i++)
            n1+=nod1[i];
            n1+=d1;
            for(i=y2-1;i>=y1;i--)
            {
                if(i%4==0)
                n2+=366;
                else
                n2+=365;
            }
            for(i=0;i<m2-1;i++)
            n2+=nod2[i];
            n2+=d2;
            no=n2-n1;
        }
        else
        {
            for(i=0;i<m2-2;i++)
            n2+=nod2[i];
            n2+=d2;
            for(i=y1-1;i>=y2;i--)
            {
                if(i%4==0)
                n1+=366;
                else
                n1+=365;
            }
            for(i=0;i<m1-1;i++)
            n1+=nod2[i];
            n1+=d1;
            no=n1-n2;
        }
        System.out.println("No of days elapsed: "+no);
    }
}                 