import java.util.*;
public class pattern8
{
    public static void main (String args[])
    {
        int i,k,j,l;
        for(i=1;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");          
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");          
            }
            for(l=1;l<=i-1;l++)
            {
                if(i==1)
                System.out.print(" "); 
                else
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}