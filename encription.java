package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class encription
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
    public String change(String t)
    {
        String s2="";
        int i,j,l=t.length();
        char c,m;
        for(i=0;i<l;i++)
        {
            c=t.charAt(i);
            j=(int) c;
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            c+=2;
            else if(j<=90 && j>=65)
            c+=1;
            s2+=c;
        }
        return s2;
    }
    public static void main(String args[])
    {
        encription o=new encription();
        System.out.println("This program is to convert a sentence  to uppercase and change a consonant to next letter ,vowel to next second letter");
        String s=o.get();
        String a=o.change(s);
        System.out.println(a);
    }
}
