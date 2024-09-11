import java.util.*;
import java.lang.*;
public class smallest
{
    public static void main (String args [])
    {     
        int e[][]=new int [3][3];
        int i,j,small;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter elements");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        e[i][j]=kb.nextInt();
        small=e[0][0];
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
        small=Math.min(small,e[i][j]);
        }
        System.out.println("smallest no is "+small);
    }   
}