public class pattern10
{
    public static void main (String args[])
    {
        int i=0,j=0;
        for(i=0;i<=4;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(j==1)
                System.out.print("*  ");
                if(j==2)
                System.out.print("+  ");
                if(j==3)
                System.out.print("-  ");
                if(j==4)
                System.out.print("/  ");
            }
            System.out.println();
        }
    }
}
