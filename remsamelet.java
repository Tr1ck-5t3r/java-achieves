import java.util.*;
import java.io.*;
import java.lang.*;
public class remsamelet
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
        String s1,s2="",s3=" ";
        int i,l,n=0,j,co=0;
        char c,c1;
        while(sb.hasMoreTokens())
        {
            s2="";
            co=0;
            s1=sb.nextToken();
            l=s1.length();
            for(i=0;i<l;i++)
            {
                co=0;
                c=s1.charAt(i);
                if(i==0)
                s2+=c;
                else
                {
                    for(j=0;j<i;j++)
                    {
                        c1=s1.charAt(j);
                        if(c1==c)
                        {
                            co++;
                        }
                    }
                    if(co==0)
                    s2+=c;
                }
            }
            s3+=s2+" ";
        }
        System.out.println(s3);
    }
    public static void main(String args[])
    {
        remsamelet o=new remsamelet();
        System.out.println("This program is to get a sentence and print the sentence after removing  same letters in the words ");
        o.get();
        o.words();
    }
}
