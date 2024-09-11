package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class wrd_permutate
{
    public int fact(int l)
    {
        int p=1;
        for(int y=2;y<=l;y++)
        p*=y;
        return p;
    }
    public void display()
    {
        Scanner kb=new Scanner (System.in);
        int i,l,j,k;
        String s,s1="";
        System.out.println("enter the number");
        s=kb.nextLine();
        l=s.length();
        char c[]=new char[l],ch;
        int co[]=new int [l];
        for(i=0;i<l;i++)
        {
            c[i]=s.charAt(i);
            co[i]=l-i;
        }
        for(i=0;i<fact(l);i++)
        {
            s1="";
            for(j=0;j<l;j++)
            {
                s1+=c[j];
            }
            ch=c[0];
            for(j=0;j<l-1;j++)
            c[j]=c[j+1];
            c[l-1]=ch;
            if(j==l)
            {
                
            }
            System.out.println(s1);
        }          
    }
    public static void main(String arg[])
    {
        wrd_permutate o= new wrd_permutate();
        o.display();
    }
}
