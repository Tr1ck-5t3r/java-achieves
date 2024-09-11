package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class toggle
{
    String s;
    public void get()
    {
        Scanner kb =new Scanner (System.in);
        System.out.println("Enter a string ");
        s=kb.nextLine();
    }
    public void words()
    {
        int i,j,l=s.length();
        char c;
        String s1="";
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                c=Character.toLowerCase(c);
                else if(Character.isLowerCase(c))
                c=Character.toUpperCase(c);
                s1+=c;
            }
            else if(c==' ')
            {
                s1+=" ";
            }
        }
        System.out.println(s1);
    }
    public static void main(String args[])
    {
        toggle o=new toggle();
        System.out.println("This program is to get a sentence print its togglecase");
        o.get();
        o.words();
    }
}
