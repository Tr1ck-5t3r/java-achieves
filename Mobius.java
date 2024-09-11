package tarun;

import java.util.*;
import java.io.*;
import java.lang.*;
public class Mobius
{
    public int get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a no");
        return kb.nextInt();
    }
    public String check()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter yes if you want to continue else enter no ");
        return kb.next();
    }
    public void mobius(int no)
    {   
        int i=2,c=0,k,m=1;
        while(no>=i)
        {
            if(c!=0 )
            {
                m=0;
                break;
            }
            else
            {                
                if(no%i==0)
                {
                    m*=-1;
                    c++;
                    no/=i;
                    if(no%i!=0)
                    {
                    c=0;
                    i++;
                    }
                }
                else
                {
                    i++;                    
                }
            }
        }
        System.out.println("function is: "+m);
    }
    public static void main(String argd[])
    {
        Mobius o=new Mobius ();
        String g;
        int n;
        for(int a=0;a<=1000;a++)
        {
            n=o.get();
            o.mobius(n);
            g=o.check();
            if(g.equalsIgnoreCase("no"))
            break;
        }
    }
}