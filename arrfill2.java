package tarun;

import java.util.*;
public  class arrfill2
{
    public static void  main (String axsf[])
    {
        int a[][];
        int i,j,n,c,k=0;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter n");
        n=kb.nextInt();
        a=new int [n][n];
        int mir=0,mic=0,mar=n-1,mac=n-1;
        c=n*n;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=0;
        }
        while (c>0)
        {
            for(i=mir;i<=mar;i++)
            {
                a[mir][i]=c--;
            }
            for(i=mir+1;i<=mar;i++)
            {
                a[i][mac]=c--;
            }
            for(i=mac-1;i>=mic;i--)
            {
                a[mar][i]=c--;
            }
            for(i=mar-1;i>mir;i--)
            {
                a[i][mic]=c--;
            }
            mac--;
            mic++;
            mir++;
            mar--;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}