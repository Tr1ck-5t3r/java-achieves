import java.util.*;
import java.lang.*;
public class greatest
{
    public static void main (String args [])
    {     
        int e[][]=new int [3][3];
        int i,j,great;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter elements");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        e[i][j]=kb.nextInt();
        great=e[0][0];
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
        great=Math.max(great,e[i][j]);
        }
        System.out.println("greatest no is "+great);
    }   
}