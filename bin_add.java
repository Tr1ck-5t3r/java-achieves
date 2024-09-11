import java.util.*;
import java.lang.*;
public class bin_add
{
    int a,b;
    public void get()//defining get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the nos ");
        a=kb.nextInt();//Getting a,b
        b=kb.nextInt();
    }
    public String bineq(int x)
    {        
        String ar="",no;
        while(x>0)
        {
            Integer o=new Integer (x%2);
            ar=o.toString()+ar;
            x/=2;
        }
        return ar;
    }
    public void task_disp()
    {
        String s1=bineq(a),s2=bineq(b),s3="";
        int c=0;
        if(s1.length()<s2.length())
        for(int i=0;i<s2.length()-s1.length();i++)
        s1="0"+s1;
        else
        for(int i=0;i<s1.length()-s2.length();i++)
        s2="0"+s2;
        for(int i=s1.length()-1;i>=0;i--)
        {
            char c1=s1.charAt(i),c2=s2.charAt(i);
            if(c==0)
            {
                if(c1=='0' && c2=='0')
                s3="0"+s3;
                else if((c1=='0' && c2=='1')||(c1=='1' && c2=='0'))
                s3="1"+s3;
                else if(c1=='1' && c2=='1')
                {
                    s3="0"+s3;
                    c++;
                }
            }
            else
            {
                if(c1=='0' && c2=='0')
                s3="1"+s3;
                else if((c1=='0' && c2=='1')||(c1=='1' && c2=='0'))
                {
                    if(i==0)
                    s3="10"+s3;
                    else
                    {
                        s3="0"+s3;
                        c++;
                    }
                }
                else if(c1=='1' && c2=='1')
                {
                    if(i==0)
                    s3="11"+s3;
                    else
                    {
                        s3="1"+s3;
                        c++;
                    }
                }
            }
        }
        System.out.println("answer is: "+s3);
    }
    public static void main(String args[])
    {
        bin_add o=new bin_add();
        o.get();
        o.task_disp();        
    }
}