package tarun;

import java.util.*;
public  class transpose
{
    public static void  main (String axsf[])
    {
        int e[][]=new int [3][3];
        int i,j;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter elements");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        e[i][j]=kb.nextInt();
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        System.out.print(e[j][i]+" ");
        System.out.println();
        System.out.println();
        } 
    }
}