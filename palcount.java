package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class palcount
{
    String s;
    public void get()
    {
        Scanner kb =new Scanner (System.in);
        System.out.println("Enter a string ");
        s=kb.nextLine();
        s=s.toUpperCase();
    }
    public void words()
    {
        StringTokenizer sb=new StringTokenizer(s);
        String s1,s2="";
        int i,l,n=0,o=0;
        String st[]=new String[200];
        String ss[]=new String[200];
        for(i=0;i<200;i++)
        {
            st[i]="";
            ss[i]="";
        }
        while(sb.hasMoreTokens())
        {
            s2="";
            s1=sb.nextToken();
            l=s1.length();
            if(l==1)
            continue;
            for(i=l-1;i>=0;i--)
            {
                s2+=s1.charAt(i);
            }
            if(s1.equalsIgnoreCase(s2))
            {
                st[n]=s1;
                n++;
            }
            else
            {
                ss[o]=s1;
                o++;
            }
        }
        System.out.println("the palindromes are: ");
        for(i=0;i<n;i++)
        System.out.println(st[i]);
        System.out.println("no of palindromes is : "+n);
        System.out.println("the non-palindromes are: ");
        for(i=0;i<o;i++)
        System.out.println(ss[i]);
        System.out.println("no of non-palindromes is : "+o);
    }
    public static void main(String args[])
    {
        palcount o=new palcount();
        o.get();
        o.words();
    }
}
