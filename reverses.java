import java.util.*;
import java.io.*;
import java.lang.*;
public class reverses
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
        StringTokenizer sb=new StringTokenizer(s);
        String s1,s2="";
        int i,l;
        while(sb.hasMoreTokens())
        {
            s1=sb.nextToken();
            l=s1.length();
            for(i=l-1;i>=0;i--)
            {
                s2+=s1.charAt(i);
            }
            s2+=" ";
        }
        System.out.println(s2);
    }
    public static void main(String args[])
    {
        reverses o=new reverses();
        System.out.println("This program is to get a sentence and reverse each words");
        o.get();
        o.words();
    }
}
