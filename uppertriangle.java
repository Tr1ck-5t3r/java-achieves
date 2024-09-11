package tarun;

import java.util.*;
public  class uppertriangle
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
        for(j=0;j<=2-i;j++)
        System.out.print(e[i][j]+" ");
        System.out.println();
        System.out.println();
        } 
    }
}