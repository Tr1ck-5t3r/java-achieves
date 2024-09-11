import java.util.*;
public  class lowertriangle
{
    public static void  main (String axsf[])
    {
        int e[][]=new int [3][3];
        int i,j,k,c;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter elements");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        e[i][j]=kb.nextInt();
        for(i=0;i<3;i++)
        {
            for(k=2;k>=i;k--)
             System.out.print("  ");
            for(j=0,c=2-i;j<=i;j++,c++)
            System.out.print(e[i][c]+" ");
            System.out.println();
            System.out.println();
        } 
    }
}