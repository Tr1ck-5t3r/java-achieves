import java.util.*;
import java.io.*;
import java.lang.*;
public class lucky_no
{
    public int get()
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("enter a no");
        return kb.nextInt();
    }
    public void lucky(int no)
    {   
        int i,c=1;
        for(i=1;i<no;c++)
        {
            System.out.print(i+" ");
            if(c%2==1)
            i+=2;
            else
            i+=4;
        }
        System.out.println();
    }
    public static void main(String argd[])
    {
        lucky_no o=new lucky_no ();
        int n=o.get();
        o.lucky (n);
    }
}