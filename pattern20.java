public class pattern20
{
    public static void main (String args[])
    {
        int i,k,j;
        for(i=0;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                if(k==4)
                System.out.print("*");
                else if(k==1)
                System.out.print("#");
                else if(k==3)
                System.out.print("@");
                else 
                System.out.print("$");         
            }
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=4;k>=i;k--)
            {
                if(k==4)
                System.out.print("*");
                else if(k==1)
                System.out.print("#");
                else if(k==3)
                System.out.print("@");
                else 
                System.out.print("$");                
            }
            System.out.println();
        }
    }
}