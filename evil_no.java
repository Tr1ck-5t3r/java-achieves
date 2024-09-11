import java.io.*;
import java.util.*;
import java.lang.*;
public class evil_no
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the range");
        int m=kb.nextInt();
        int n=kb.nextInt();
        int i,k,s=0;   
        if(m>=n)
        System.out.println("INVALID RANGE");
        else
        {
            System.out.println("THE EVIL NUMBERS ARE:-");
            for(i=m;i<=n;i++)
            {
                s=0;
                k=i;
                while(k>0)
                {
                    if(k%2==1)
                    s++;
                    k/=2;
                }
                if(s%2==0)
                System.out.println(i);
            }
        }
    }
}