import java.io.*;
import java.util.*;
import java.lang.*;
public class odious_no
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=kb.nextInt();
        int no=n;
        int c=0;
        long ar=0;
        while(no>0)
        {
            if(no%2==1)
            c++;
            ar=(ar*10)+no%2;
            no/=2;
        }
        if(c%2==1)
        {
            System.out.println("binary equivalent: "+ar);
            System.out.println("no of 1s: "+c);
            System.out.println("odious number");
        }
    }
}