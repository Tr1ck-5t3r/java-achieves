import java.util.*;
import java.lang.*;
public class weww
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner  (System.in);
        System.out.println("enter the word");
        String s=kb.nextLine();
        String ss="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            Integer a=new Integer(((int)c));
            ss+=a;
        }
        StringBuffer sb=new StringBuffer(ss);
        System.out.println(sb.reverse());
    }
}
