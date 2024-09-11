package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class cons_vow
{
    String s;
    public void get()
    {
        Scanner kb =new Scanner (System.in);
       System.out.println("Enter a string ");
        s=kb.nextLine();
        s=s.toUpperCase();
    }
    public int  vowel(String t)
    {
        int c1=0,l=t.length(),i;
        char c;
        for(i=0;i<l;i++)
        {
            c=t.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            c1++;
        }
        return c1;
    }
    public int cons(String t)
    {
        int c1=0,j,l=t.length(),i;
        char c;
        for(i=0;i<l;i++)
        {
            c=t.charAt(i);
            j=(int) c;
            if(j<=90 && j>=65)
            {
            c1++;
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            c1--;
            }
        }
        return c1;
    }
    public void words()
    {
        StringTokenizer sb=new StringTokenizer(s);
        String s1;
        int i,cv,cs;
        System.out.println("word\tvowel\tconsonat");
        while(sb.hasMoreTokens())
        {
            s1=sb.nextToken();
            cv=vowel(s1);
            cs=cons(s1);
            System.out.println(s1+"\t"+cv+"\t"+cs);
        }
    }
    public static void main(String args[])
    {
        cons_vow o=new cons_vow();
        System.out.println("This program is to convert a sentence to uppercase and print no of consonants and vowewls in each word");
        o.get();
        o.words();
    }
}
