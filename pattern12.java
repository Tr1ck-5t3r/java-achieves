package tarun;

import java.util.*;
public class pattern12
{
    public static void main (String args[])
    {
        int i,k,j;
        String s="abcde";
        String s1,s2;
        for(i=0;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");          
            }
            for(j=0;j<i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
            
        }
    }
}