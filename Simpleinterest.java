import java.util.*;
import java.lang.*;
import java.io.*;
public class Simpleinterest
{
    public static void main(String args[])
    {
        int p,r,t,si;
        Scanner Kb=new Scanner(System.in);
        System.out.println("enter value of principle");
        p=Kb.nextInt();
        System.out.println("enter value of  rate ofinterest");
        r=Kb.nextInt();
        System.out.println("enter value of  no of years");
        t=Kb.nextInt();
        si=(p*r*t)/100;
        System.out.println("s.i. is"+si);
        System.out.println("thank you");
    }
} 