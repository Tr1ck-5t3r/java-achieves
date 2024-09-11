package tarun;


import java.io.*;
import java.util.*;
import java.lang .*;
public class rearrange
{
    public static void main (String asgd[])
    {
        Scanner kb=new Scanner (System.in);
        String s,s1,s2="",s3[],s4;
        int i,l,j,k;
        char c,c1;
        System.out.println("enter a line");
        s=kb.nextLine();
        l=s.length();
        s=s.toUpperCase();
        c=s.charAt(l-1);
        s=s.substring(0,l-1);
        s+=" ";
        s3=new String [100];
        if(c=='!'||c=='.'||c=='?')
        {
            System.out.println("sentence is valid");
            k=0;
            for(i=0;i<=l;i++)
            {
                if(i==l)
                break;
                j=s.indexOf(' ',i);
                s1=s.substring(i,j);
                if(s1.charAt(0)==s1.charAt(s1.length()-1))
                {
                    s3[k]=s1;
                    s2+=s1+" ";
                    k++;
                }
                i=j;
            }
            k=0;
            for(i=0;i<=l;i++)
            {
                if(i==l)
                break;
                j=s.indexOf(' ',i);
                s1=s.substring(i,j);
                s4=s3[k];
                if(k<=s3.length)
                if(!(s1.equals(s3[k])))
                {
                    s2+=s1+" ";
                    k++;
                }
                i=j;
            }
            s2=s2.substring(0,l-1);
            s2+=c;
            System.out.println("new line is: "+s2);
        }
        else 
        System.out.println("sentence is not valid");
    }
}
    