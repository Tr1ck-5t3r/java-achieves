import java.io.*;
import java.util.*;
import java.lang.*;
public class alphabetical
{
    public String get()
    {
        String b;
        Scanner kb =new Scanner (System.in);
        System.out.println("Enter a string ");
        b=kb.nextLine();
        return b;
    }
    public String change(String t)
    {
        String s2="";
        String s1=t;
        int l1=s1.length(),l=t.length(),i,j,p;
        char c,m;
        for(i=0;i<l;i++)
        {
            c=s1.charAt(0);
            p=0;
            for(j=1;j<l1;j++)
            {
                if(s1.charAt(j)<c)
                {
                    c=s1.charAt(j);
                    p=j;
                }
            }
            s2+=c;
            s1=s1.substring(0,p)+s1.substring(p+1);
            l1=s1.length();
        }
        return s2;
    }
    public static void main(String args[])
    {
        alphabetical o=new alphabetical();
        System.out.println("This program is to get a word, change and print in alphabetical order");
        String s=o.get();
        String a=o.change(s);
        System.out.println(a);
    }
}
