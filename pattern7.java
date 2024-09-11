import java.util.*;
public class pattern7
{
    public static void main (String args[])
    {
        int i,k,j;
        for(i=1;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");          
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);          
            }
            System.out.println();
        }
        }
}
       