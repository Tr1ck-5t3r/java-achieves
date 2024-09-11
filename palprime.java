import java.io.*;
import java.util.*;
import java.lang.*;
public class palprime
{
    public static void main (String args[])
    {
        int n,m,c=0,i,j,s=0,r=0,cp;
        Scanner kb=new Scanner (System.in);
        System.out.println("program to print palindrome prime numbers within a range");
        System.out.println("Enter ranges where m<n");
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println(" palindrome prime numbers are ");
        for (i=m;i<=n;i++)
        {
            cp=i;
            while (cp>0)
            {
                r=cp%10;
                s=(s*10)+r;
                cp/=10;
            }
            for (j=1;j<i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(s==i && c==1)
            System.out.println(s);
            s=0;
            r=0;
            c=0;
        }
    }
}
