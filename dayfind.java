import java.io.*;
import java.util.*;
import java.lang.*;
public class dayfind
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of date on which day is to be found");
        int dd=kb.nextInt();
        System.out.print(" ");
        int mm=kb.nextInt();
        System.out.print(" ");
        int yr=kb.nextInt();
        System.out.println();
        int nd=0,i,r,j,k;
        int nod[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String date,t ,d[]={"Sunday","Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
        System.out.println("Enter day on January 1st,");
        String s=kb.next();
        for(i=0;i<7;i++)
        if(s.equalsIgnoreCase(d[i]))
        s=d[i];
        if((yr%100)%4==0)
        nod[1]=29;
        for(i=0;i<mm-1;i++)
        nd+=nod[i];
        nd+=dd;
        r=nd%7;
        for(i=0;i<7;i++)
        {
            if(s==d[i])
            break;
        }
        for(j=0;j<=i+1;j++)
        {
            t=d[6];
            for(k=6;k>=1;k--)
            d[k]=d[k-1];
            d[0]=t;
        }
        System.out.println("date on "+dd+"/"+mm+"/"+yr+" is: "+d[r]); 
    }
}                 