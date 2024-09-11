import java.util.*;
import java.lang.*;
public class hummingno
{
    int n1,n2;
    String s1="",s2="";
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter two nos");
        n1=kb.nextInt();
        n2=kb.nextInt();
    }
    public void len_eq()
    {
        int i;
        if(s1.length()>s2.length())
        for(i=0;i<s1.length()-s2.length();i++)
        s2=" "+s2;
        else 
        if(s2.length()>s1.length())
        for(i=0;i<s2.length()-s2.length();i++)
        s1=" "+s1;
    }
    public void bin_conv()
    {
        int no=n1;
        while(no>0)
        {
            s1=Integer.toString(no%2)+s1;
            no/=2;
        }
        no=n2;
        while(no>0)
        {
            s2=Integer.toString(no%2)+s2;
            no/=2;
        }
    }
    public void hum_fin()
    {
        boolean t=true;
        int i;
        for( i=0;i<s2.length();i++)
        if(s1.charAt(i)!=s2.charAt(i))
        {
            t=false;
            break;
        }
        if(t==true)
        System.out.println("humming distance is: 0");
        else
        System.out.println("humming distance is: "+(s1.length()-i++));
    }
    public static void main(String args[])
    {
        hummingno o=new hummingno ();
        o.get();
        o.bin_conv();
        o.len_eq();
        o.hum_fin();
    }
}