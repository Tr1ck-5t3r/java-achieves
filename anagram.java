package tarun;

import java.io.*;
import java.util.*;
import java.lang .*;
public class anagram
{
    public static void main (String asgd[])
    {
        Scanner kb=new Scanner (System.in);
        String s3,s1,s2,s4;
        int i,l1,l2,j,k=0;
        System.out.println("enter two words");
        s1=kb.nextLine();
        s2=kb.nextLine();
        s3=s1;
        s4=s2;
        l1=s1.length();
        l2=s2.length();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            if(s1.charAt(i)==s2.charAt(j))
            {
                s1=s1.substring(0,i)+s1.substring(i+1);
                s2=s2.substring(0,j)+s2.substring(j+1);
                l2=s2.length();
                l1=s1.length();
                break;
            }
            if(j>=l2)
            {
                k++;
                break;
            }
        }
        if(k==0)
        System.out.println(s3+" is an Anagram of "+s4);
        else
        System.out.println("these two words are not anagrams");
    }
}