package tarun;

public class pattern17
{
    public static void main (String args[])
    {
        int i,k,j;
        for(i=0;i<=5;i++)
        {
            for(j=0;j<i;j++)
              System.out.print(" ");
            for(k=5;k>=i;k--)
              System.out.print("*"); 
            for(k=4;k>=i;k--)
            System.out.print("*"); 
            System.out.println();
        }
    }
}