import java.util.*;
public class lcm
{
     int c,d,temp;
    public int lcm (int a,int b)
    {
        c=a;
        d=b;
        while(b != 0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[])
    {
        lcm o=new lcm();
        int a,b;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 2 nos");
        a=kb.nextInt();
        b=kb.nextInt();
        int k=o.lcm(a,b);
        int lcm=(a*b)/k;
        System.out.println("LCM is "+lcm);
    }
}