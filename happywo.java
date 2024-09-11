package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class happywo
{
    public String get()
    {
        String b;
        Scanner kb =new Scanner (System.in);
        System.out.println("Enter a string ");
        b=kb.nextLine();
        b=b.toUpperCase();
        return b;
    }
    public int happy (String t)
    {
        String s2="";
        int l=t.length(),i,j,s=0,h=0,k;
        char c,m;
        for(i=0;i<l;i++)
        {
            c=t.charAt(i);
            k=((int) c)-64;
            if(k>=10)
            h=(h*100)+k;
            else
            h=(h*10)+k;
        }
        do
        {
            s=0;
            do
            {
                j=h%10;
                s+=j*j;     
                h/=10;
            }while(h>=1);
            h=s;
        }while(s>9);
        
        return s;
    }
    public void words (String s)
    {
        StringTokenizer sb=new StringTokenizer(s);
        String s1;
        int i;
        while(sb.hasMoreTokens())
        {
            s1=sb.nextToken();
            i=happy(s1);
            if(i==1)
            System.out.println(s1+" is a happy word");
            else
            System.out.println(s1+" is not a happy word");
        }
    }
    public static void main(String args[])
    { 
        happywo o=new happywo();
        System.out.println("This program is to get a sentence, and print whether each word is a happy word");
        String s=o.get();
        o.words(s);
    }
}
