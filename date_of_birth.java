import java.util.*;
public class date_of_birth
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,h,i,sum,diff,avg;
        Scanner Kb=new Scanner (System.in);
        System.out.println("enter the year of birth");
        a=Kb.nextInt();
        System.out.println("enter the present year");
        b=Kb.nextInt();
        c=b-a;
        System.out.println("Your age is "+c);
        System.out.println("thank you");
    }
} 