package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class arr_sen1
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
        int i,j;
        char c,c1;
        String s1,s2=s,s3="";
        int l;
        for(i=65;i<=90;i++)
        {
            StringTokenizer sz=new StringTokenizer(s2);
            l=sz.countTokens();
            c1=(char) i ;
            for(j=0;j<l;j++)
            {
                s1=sz.nextToken()+" ";
                c=s1.charAt(0);
                if(c1==c)
                {
                    s3+=s1;
                }
            }
        }
        System.out.println(s3);
    }
    public static void main(String args[])
    {
        arr_sen1 o=new arr_sen1();
        System.out.println("This program is to get a sentence and convert to uppercase and arrange each word in alphabetical order and print it");
        o.get();
        o.words();
    }
}
