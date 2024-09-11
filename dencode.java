import java.util.*;
import java.lang.*;
import java.io.*;
public class dencode
{
    String s,ns="";
    public void get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter coded text");     
        s=kb.nextLine();
        s=s.toUpperCase();
    }
    public void display()
    {
        int l=s.length(),i,co=1,j;
        char c='\0',c1='\0';
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(i!=l-1)
            c1=s.charAt(i+1);
            if(c=='K' && c1=='K' && i!=l-1)
            {
                for(j=i+2,co=0;;j+=2,co+=2)
                {
                    c=s.charAt(j);
                    c1=s.charAt(j+1);
                    i++;
                    if((c!='K' && c1!='K')||(c=='K' && c1!='K')||(c1=='K' && c1=='K'))
                        break;
                }
                ns+=" ";
            }
            else if(c<='X' && c>='A')
            {
                if(co==0)
                ns+=(char)(c+34);
                else
                {
                ns+=(char)(c+2);
                co=0;
            }
            }
            else if(c=='Y' || c=='Z')
            {
                if(co==0)
                ns+=(char )(c+8);
                else
                {
                ns+=(char)(c-24);
                co=0;
            }
            }
        }
        System.out.println("new string is: "+ns);
    }
    public static void main(String arg[])
    {
        dencode o=new dencode ();
        o.get();
        o.display();
    }
}