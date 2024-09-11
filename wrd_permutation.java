package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class wrd_permutation
{
    public int fact(int z)
    {
        int p=1;
        for(int y=2;y<=z;z++)
        p*=y;
        return p;
    }
    public static void main(String arg[])
    {
        wrd_permutation o= new wrd_permutation();
        Scanner kb=new Scanner (System.in);
        int i,l,j,k;
        String s,s1;
        char c[]=new char[50];
        System.out.println("enter the number");
        s=kb.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        c[i]=s.charAt(i);
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            if(j!=i)
            {
                for(k=0;k<l;k++)
                if(j!=k && k!=i)
                {
                    s1="";
                    s1+=c[i];
                    s1+=c[j];
                    s1+=c[k];
                    System.out.println(s1);
                }
            }
        }
    }
}