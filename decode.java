import java .io.*;
import java .lang.*;
import java .util.*;
public class decode
{
    public static void main(String argt[])
    {
        Scanner kb=new Scanner (System.in);
        int l,i,k,j,n;
        String s="",s1,s2,ss="";
        System.out.println("Enter code");
        ss =kb.nextLine();
        for(i=0;i<ss.length();i++)
        {
            s=ss.charAt(i)+s;
        }
        l=s.length();//2312179862310199501872379223
        ss="";
        for(i=0;i<l-1;i++)//1217986231019950187237923101811792723
        {
            k=0;
            s1="";
            j=0;
            s2="";
            if(i!=l-1)
            {
            s1=s.charAt(i)+""+s.charAt(i+1);
            k=Integer.parseInt(s1);
            }
            if(i!=l-2)
            {
            s2=s.charAt(i)+""+s.charAt(i+1)+""+s.charAt(i+2);
            j=Integer.parseInt(s2);
            } 
            if((k>=65 && k<=90) || (k>=97 && k<=99 ) && i!=l-1 )
            {
                ss+=(char)k;
                i++;
            }
            else if(s1.equals("32"))
            {
                i++;
                ss+=" ";
            }
            else if ((j>=100 && j<=122 ) && i!=l-2)
            {
                ss+=(char)j;
                i+=2;
            }
            
        }
        System.out.println("coded text is "+ss);
    }
}
