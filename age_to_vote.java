import java.util.*;
public class age_to_vote
{
    public static void main(String args[])
    {
        int a,b,c;
        String name;
        Scanner Kb=new Scanner(System.in);
        System.out.println("enter your name");
        name=Kb.nextLine();
        System.out.println("enter year of birth");
        a=Kb.nextInt();
        System.out.println("enter present year");
        b=Kb.nextInt();
        c=b-a;
        System.out.println("Your age is "+c);
        if (c<17)
        {
            System.out.println("You are not eligible to vote");
        }
        else 
        {
             System.out.println("You are eligible to vote");
        }
    }
}
  