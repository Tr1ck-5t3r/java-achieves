import java.io.*;
import java.util.*;
import java.lang.*;
public class date
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n=kb.nextInt();
        int yr,nd,i,j=n,k,l=0,m;
        String mth[]={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        int nod[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter year");
        yr=kb.nextInt();
        System.out.println("Enter no of days");
        nd=kb.nextInt();
        if((yr%100)%4==0)
        nod[1]=29;
        if(!(1<=n && n<=366))
        System.out.println("Invalid number");
        else if((yr%100)%4!=0 && n==366)
        System.out.println("Invalid input");
        else if(nd<=100 && 1<=nd)
        {
            for(i=0;i<12;i++)
            {
                j=j-nod[i];
                if(j<=nod[i+1] && i!=12)
                break;
            }
            if ((n+nd)>366)
            m=yr+1;
            else
            m=yr;
            if((j+nd)>nod[i] && (n+nd)<366)
            {
                k=j+nd;
                for(l=i;l<=12;l++)
                {
                    k-=nod[l];
                    if(k<=nod[i+1] && l!=12)
                    break;
                }
            }
            else if((j+nd)>nod[i] && (n+nd)>366)
            {
                k=nd-(366-n)+1;
                for(l=0;l<12;l++)
                {
                    k-=nod[l];
                    if(k<=nod[i+1] && l!=12)
                    break;
                }
            }
            else
            {
                k=j+nd;
                l=i;
            }
            System.out.println(j+" th "+mth[i+1]+" "+yr);
            System.out.println(k+" th "+mth[l+1]+" "+m);
        }
    }
}                 