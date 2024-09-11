import java.io.*;
import java.util.*;
import java.lang.*;
public class daytell
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of date on which day is to be tell");
        String s=kb.next(),d,t ; 
        int i=0,l=s.length(),n,yr,ny=365;
        char c;
        boolean ch=false;
        int nod[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String mth[]={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        if(l<5)
        System.out.println("invalid input");
        else
        {
            n=Integer.parseInt(s.substring(0,l-4));
            yr=Integer.parseInt(s.substring(l-4));
            while(n>0)
            {
                if(yr%4!=0)
                ny=365;
                else
                ny=366;
                if(n>ny)
                {
                    yr++;
                    n-=ny;
                }
                else
                {
                    for(i=0;i<12;i++)
                    {
                        if(n<nod[i])
                        {
                            ch=true;
                            break;
                        }
                        else
                        n-=nod[i];
                    }
                    if (ch==true)
                    break;
                }
            }
            System.out.println("date is: "+n+" "+mth[i]+" "+yr);
        }
    }
}                 