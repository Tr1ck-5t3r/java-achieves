package tarun;

import java.util.*;
public class BUZZNO
{
    public static void main (String args[])
    {
        int no,i;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a no");
        no=kb.nextInt();
        i=no%10;
        if(i==7||i%7==0)
        System.out.println("Is a buzz no");
        else
        System.out.println("Is not a buzz no");
    }
}
       