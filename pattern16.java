package tarun;

public class pattern16
{
    public static void main (String args[])
    {
        int i,k,j,c=0;
        for(i=0;i<=5;i++)
        {
            for(k=5;k>=i;k--)
              System.out.print(c); 
            for(j=0;j<i;j++)
              System.out.print(" ");
            for(j=0;j<i;j++)
              System.out.print(" ");
            for(k=5;k>=i;k--)
              System.out.print(c); 
            System.out.println();
            c++;
        }
    }
}