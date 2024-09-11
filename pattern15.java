//00000000000
// 111111111
//  2222222
//   33333
//    444
//     5
public class pattern15
{
    public static void main (String args[])
    {
        int i,k,j;
        for(i=0;i<=5;i++)
        {
            for(j=0;j<i;j++)
              System.out.print(" ");
            for(k=5;k>=i;k--)
              System.out.print(j);          
            for(k=4;k>=i;k--)
              System.out.print(j); 
            System.out.println();
        }
    }
}