package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class daycalc
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of date on which day is to be found");
        System.out.print("day ");
        int dd=kb.nextInt();
        System.out.print("month ");
        int mm=kb.nextInt();
        System.out.print("year ");
        int yr=kb.nextInt();
        System.out.println();
        int nd,i,r,j,k,y=yr,d=0,m=mm,ny;
        int nod[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter no of days");
        nd=kb.nextInt();
        while(nd>0)
        {
            if(yr%4==0)
            {
                ny=366;
                nod[1]=29;
            }
            else
                ny=365;
            if(nd>ny)
            {
                y++;
                nd-=ny;
            }
            else
            {
                i=mm-1;
                while(nd>0)
                {
                    if(yr%4==0)
                    {
                        ny=366;
                        nod[1]=29;
                    }
                    else
                    ny=365;
                    if(nd>nod[i])
                    {
                        nd-=nod[i];
                        m++;
                        i++;
                        if(i==11)
                        {
                            i=0;
                            m=1;
                            y++;
                        }
                    }
                    else
                    {
                        d=nd;
                        nd=0;
                        break;
                    }
                }
            }
        }
        System.out.println("Project to be submitted on ");
        System.out.println("day: "+d);
        System.out.println("month: "+m);
        System.out.println("year: "+y);
    }
}                 