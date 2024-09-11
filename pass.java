import java.io.*;
import java.util.*;
public class pass
{
    public void passing(int a[] )
    {
        for (int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            System.out.println ("It is even :"+a[i]);
            else
            System.out.println ("It is odd :"+a[i]);
        }
    }
    public static void main (String asd[])
    {
        pass o=new pass();
        Scanner kb = new Scanner (System.in);
        int x[]=new int[10];
        System.out.println ("enter an array");
        for (int i=0;i<10;i++)
        x[i]=kb.nextInt();
        o.passing(x);
    }
        
}