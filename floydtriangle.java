package tarun;

import java.util.*;
public class floydtriangle
{
    public static void main (String args[])
    {
        int i,j,c=0;
        Scanner kb=new Scanner(System.in);
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}