package tarun;

import java.util.*;
public class factorial
{
    public static void main (String args[])
    {
        int j,k,i,fact;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                for(k=1,fact=1;k<=j;k++)
                 fact*=k;
                System.out.print(fact+" ");
            }
            System.out.println();
        }
    }
}
