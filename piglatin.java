package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class piglatin
{
    public static void main (String ags[])
    {
        int l,i,p,j,l1,p1=0,k;
        char c;
        String s,s1,s2=" ",s3=" ";
        Scanner kb=new Scanner (System.in);
        System.out.println("program to accept a string and convert the given string to piglatin and then display it ");
        System.out.println("enter a line ");
        s=kb.nextLine ();
        s=s.toUpperCase();
        s=s.trim();
        s=s+" ";
        l=s.length();
        for (i=0;i<l;i++)
        {
            p=s.indexOf(" ",i);
            s1=s.substring(i,p);
            l1=s1.length();
            for (j=0;j<l;j++)            
            {
                if(s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U')
                {
                    p1=j;
                    break;
                }
            }
            s2=s1.substring(p1,l1)+s1.substring(0,p1)+"AY ";
            s3=s3+s2;
            i=p; 
            p1=0;
            l1=0;
            p=0;
        }
        s3=s3.substring(1);
        System.out.println("Sentence in piglatin is ;-");
        System.out.println(s3);
    }
}
