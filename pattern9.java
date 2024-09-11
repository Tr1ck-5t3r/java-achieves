package tarun;

import java.util.*;
public class pattern9
{
    public static void main (String args[])
    {
        int i,j;
        String s= "stanes";
        String s1,s2;
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
            s1=s.substring(0,1);
            s2=s.substring(1);
            s=s2+s1;
        }
    }
}
       