package tarun;

import java.util.*;
public class arrays
{
    public static void main (String args [])
    {     
        String a[]=new String[9];
        int i,j,k;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter nine names");
        for(i=0;i<9;i++)
        a[i]=kb.nextLine();
        for(i=0,k=0;i<3;i++)
        {
        for(j=0;j<3;k++,j++)
        System.out.print(a[k]+" ");
        System.out.println(); 
        }
    }   
}