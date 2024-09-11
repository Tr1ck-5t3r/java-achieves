import java.io.*;
import java.util.*;
public class pass_ob
{
    public int a,b,c;
    public void passing(pass_ob s)
    {
        c=s.a+s.b;
         System.out.println (c);
    }
    public static void main (String asd[])
    {
        pass_ob o=new pass_ob();
        Scanner kb = new Scanner (System.in);
        o.a=kb.nextInt();
        o.b=kb.nextInt();
        o.passing(o);
    }
        
}