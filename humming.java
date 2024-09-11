import java.util.*;
import java.lang.*;
public class humming
{
    String s1,s2;
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter two words");
        s1=kb.next();
        s2=kb.next();
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
        System.out.println("humming distance is: "+(s1.length()-i));
    }
    public static void main(String args[])
    {
        humming o=new humming ();
        o.get();
        o.len_eq();
        o.hum_fin();
    }
}