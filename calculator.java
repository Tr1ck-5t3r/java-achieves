import java.util.*;
import java.math.*;
public class calculator 
{
    public static void main (String args[])
    {
        double a,b,c=0;
        int result;
        String get;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the numbers ");
        a=kb.nextDouble();
        b=kb.nextDouble();
        System.out.println("enter the operation as sum/subtract/multiply/divide");
        get=kb.next();
        if(get.equalsIgnoreCase("sum"))
        c=a+b;
        else if(get.equalsIgnoreCase("subtract"))
        c=a-b;
        else if(get.equalsIgnoreCase("multiply"))
        c=a*b;
        else if(get.equalsIgnoreCase("divide"))
        c=a/b;
        result=(int)c;
        System.out.println("result:"+result);
    }
}
