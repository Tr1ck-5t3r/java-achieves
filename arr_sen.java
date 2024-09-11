import java.util.*;
import java.lang.*;//importing header  files
public class arr_sen//defining class arr_sen
{
    String s,ns="";//intance variables
    public void get()//defining get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a paragraph ");
        s=kb.nextLine();//Getting s
        s=s.toUpperCase();
        s+=" ";
    }
    public String separate(int i)//defining separate()
    {
        int t=s.lastIndexOf(' '),j,c;
        char sym[]={'?','!',',','.'};
        for(j=0;j<=3;j++)
        {
            c=s.indexOf(sym[j],i);
            if(t>c && c!=-1)
            t=c;
        }
        return s.substring(i,t);
    }
    public String arrange(String s2)
    {
        String s3="",a;
        for(char c1='A';c1<='z';c1++)
        {
            StringTokenizer sz=new StringTokenizer(s2);
            int l=sz.countTokens();
            for(int j=0;j<l;j++)
            {
                a=sz.nextToken()+" ";
                char c=a.charAt(0);
                if(c1==c)
                {
                    s3+=a;
                }
            }
        }
        return s3;
    }
    public void vows()
    {
        StringTokenizer z=new StringTokenizer(s);
        char ca[]={'A','E','I','O','U'};
        System.out.println("the words with vowels are");
        while (z.hasMoreTokens())
        {
            String s2=z.nextToken();
            if(!Character.isLetter(s2.charAt(s2.length()-1)))
            s2=s2.substring (0,s2.length()-1);
            for(int i=0;i<5;i++)
            if(s2.charAt(0)==ca[i])
            System.out.print(s2+" ");
        }
    }
    public void task_disp()//defining tasks()
    {
        for(int k=0;k<s.length();k++)
        {
            String s1=separate(k);
            ns+=arrange(s1)+s.charAt(s1.length()+k);
            k+=s1.length();
        }
        System.out.println("new line is"+ns);
    }
    public static void main(String[] args)
    {
        arr_sen o=new arr_sen ();//creating object of arr_sen
        o.get();//calling get()
        o.task_disp();//calling task_disp()
        o.vows();//calling vows()
    }
}