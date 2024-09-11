import java.io.*;
import java.util.*;
import java.lang.*;
public class natural
{
    public static void main(String argd[])
    {
        int n,i=0,j,l,m;
        String s0[]={" ","one","two","three","four","five","six","seven","eight","nine"};
        String s1[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String s2[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String s,ss="";
        char c,c2;
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a number");
        n=kb.nextInt();
        s=Integer.toString(n);
        if(s.length()==1)
        s="000"+s;
        if(s.length()==2)
        s="00"+s;
        if(s.length()==3)
        s="0"+s;
        if(n>=10000)
        System.out.println("invalid input");
        else
        {
            for(i=3;i>=0;i--)
            {
                if(i==2)
                continue;
                c=s.charAt(i);
                j=((int) c)-48;
                if(i==3)
                {
                    c2=s.charAt(i-1);
                    m=((int) c2)-49;
                    if(c2=='1')
                    ss=s2[j-1];
                    else if(c2>'0' && c2<='9')
                    {
                        ss=s1[m]+" "+s0[j];
                    }
                    if(c2=='0')
                    ss=s1[j];
                }
                if(i==1 && j!=0)
                {
                    ss=s0[j]+" hundred and " +ss;
                }
                if(i==0 && j!=0)
                {
                    ss=s0[j]+" thousand and " +ss;
                }
            }
            System.out.println(ss);
        }
    }
}