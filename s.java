import java.util.*;
import java.lang.*;
public class s
{
    String s;
    public void get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter operation");
        s=kb.nextLine();
    }    
    public void operation()
    {
        char  ch[]={'+', '-', '/', '*'};
        int c=0,i,a,b,p=0,pos=0;
        char  cr;
        double  r=0;
        for(i=0;i<4;i++)
        {
            p=s.indexOf(ch[i]);
            if(p!=-1)
            {
            c++;
            pos=p;
            }
        }
        if(c!=1)
        System.out.println("Invalid input");
        else
        {
            a=Integer.parseInt(s.substring(0,pos));
            b=Integer.parseInt(s.substring(pos+1));
            cr=s.charAt(pos);
            if(cr=='+')
            r=a+b;
            else if(cr=='-')
            r=(a>b)?a-b:b-a;
            else if(cr=='*')
            r=a*b;
            else if(cr=='/')
            r=a/b;
            System.out.println("result is: "+r);
        }
    }
    public static void main(String args[])
    {
        s o=new s();
        o.get();
        o.operation();
    }
}
