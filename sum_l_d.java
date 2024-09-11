import java.util.*;
public class sum_l_d
{
    public static void main (String args [])
    {     
        int e[][]=new int [3][3];
        int i,j,sum=0;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter elements");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        e[i][j]=kb.nextInt();
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        if(i==2-j)
        sum+=e[i][j];
        System.out.println("sum is "+sum);
    }   
}