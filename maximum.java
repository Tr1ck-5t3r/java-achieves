import java.util.*;
import java.math.*;
public class maximum
{
    public static void main (String args[])
    {
        int a,b,c,max;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=kb.nextInt();
        b=kb.nextInt();
        c=kb.nextInt();
        if(a<b)
        max=Math.max(a,c);
        else
        max=Math.max(b,c);
        System.out.println(max);
    }
}
