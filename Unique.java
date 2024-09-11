import java.io.*;
import java.util.*;
import java.lang.*;
public class Unique
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the range");
        int m=kb.nextInt();
        int n=kb.nextInt();
        int i,j,k,co=0;
        boolean c,c3;
        char c1,c2;
        if(m>=n )
        System.out.println("invalid range ");
        else
        {
            System.out.println("the unique digits are ");
            for(i=m;i<=n;i++)
            {
                String s=Integer.toString(i);
                c=true;
                c3=true;
                co++;
                for(k=0;k<s.length()-1;k++)
                {
                    c1=s.charAt(k);
                    for(j=k+1;j<s.length();j++)
                    {
                        c2=s.charAt(j);
                        if(c1==c2)
                        {
                            c=false;
                            c3=false;
                            co--;
                            break;
                        }
                    }
                    if(c3==false)
                    break;
                }
                if(c==true)
                System.out.println(i);
            }
            System.out.println("the no of unique digits is: "+co);
        }
    }
}
                   