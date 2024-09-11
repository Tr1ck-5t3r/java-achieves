import java.util.*;
import java.lang.*;//importing header  files
public class sentense//defining class sentense
{
    String s,w,ns="";//intance  variables
    int pos;
    public void get()//defining get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a sentense ");
        s=kb.nextLine();//Getting s
        s=s.toUpperCase();
        System.out.println("enter a word ");
        w=kb.next();//Getting w
        w=w.toUpperCase();
        w=w.trim();
        System.out.println("enter position to insert word ");
        pos=kb.nextInt();//Getting pos
    }
    public boolean check()//defining check()
    {
        int l=s.length()-1;
        if(s.charAt(l)=='.'||s.charAt(l)=='?'||s.charAt(l)=='!')
        return  true;
        else
        return false;
    }
    public void task_disp()//defining tasks()
    {
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        for (int i=1;i<=l;i++)
        {
            String a=st.nextToken();
            if(i==pos)
            ns+=w+" ";
            ns+=a+" ";
        }
        System.out.println("old word: "+s);
        System.out.println("new word: "+ns);
    }
    public static void main(String[] args)
    {
        sentense o=new sentense ();//creating object of no_rep
        o.get();//calling get()
        boolean t=o.check();//calling check
        if(t==true)
        {
            o.task_disp();//calling task_disp
        }
        else
        System.out.println("wrong input,next time enter line with . or ? or ! ");
    }
}