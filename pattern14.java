import java.util.*;
public class pattern14
{
    public static void main (String args[])
    {
        int i,k,j;
        for(i=0;i<=5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(j);
            }
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");          
            }
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}