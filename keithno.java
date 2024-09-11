import java.io.*;
import java.util.*;
import java.lang.*;
public class keithno
{
    public static void main (String args[])
    {
        Scanner kb=new Scanner (System.in);
        int a,n,b,c,s=0,co=0,i=0;
        System.out.println("program to accept a number and print if it is a kieth no or not");        
        System.out.println("Enter a three digit no");
        n=kb.nextInt();
        a=n/100;
        b=(n/10)%10;
        c=n%10;
        while (s!=n)
        {
            s=a+b+c;
            a=b;
            b=c;
            c=s;
            if(s>n)
            break;
            else if(s==n)
            i=1;
        }
        if (i==1)
        System.out.println("It is a keith no");
        else
        System.out.println("It is not a keith no");
    }
}
