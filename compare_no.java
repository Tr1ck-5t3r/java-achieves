import java.util.*;
import java.lang.*;//importing header  files
public class compare_no//defining class compare_no
{
    int a,b;//intance  variables
    public void get()//defining get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the nos ");
        a=kb.nextInt();//Getting a,b
        b=kb.nextInt();
    }
    public boolean compare()//defining compare()
    {
        Integer x=new Integer (a);
        Integer y=new Integer (b);
        String s1=x.toString(),s2=y.toString();//converting nos to string
        int i,j;
        char c1,c2;// local variables
        boolean t=true;
        if(s1.length()>s2.length())//making strings of equal length
        for (i=s1.length()-s2.length();i>0 ;i++ )
        s2="0"+s2;
        else//making strings of equal length
        for (i=s2.length()-s1.length();i>0 ;i++ )
        s1="0"+s1;
        for (i=0;i<s1.length();i++)//comparing two strings
        {
            c1=s1.charAt(i);
            c2=s2.charAt(i);
            if(c1!=c2)
            t=false;
        }
        return t;//returning boolean value
    }
    public void display()//defining display()
    {
        Integer x=new Integer (a);
        Integer y=new Integer (b);
        String s1=x.toString(),s2=y.toString();//converting nos to string
        int i;
        System.out.print("a is: ");//printing a
        for(i=0;i<s1.length();i++)
        if(i!=s1.length()-1)System.out.print(s1.charAt(i)+",");
        else System.out.println(s1.charAt(i));
        System.out.print("b is: ");//printing b
        for(i=0;i<s2.length();i++)
        if(i!=s2.length()-1)System.out.print(s2.charAt(i)+",");
        else System.out.println(s2.charAt(i));
        if(compare()==true)//printing if strings are equal or not
        System.out.println("Nos are equal");
        else
        System.out.println("Nos are not equal");
    }
    public static void main(String[] args)
    {
        compare_no o=new compare_no ();//creating object of compare_no
        o.get();//calling get()
        o.display();//calling display
    }
}