package tarun;

import java.util.*;
public class week_days
{
    public static void main (String args[])
    {
         int no;
         Scanner Kb=new Scanner (System.in);
         System.out.print("enter a number from 1 to 7");
         no=Kb.nextInt();
         if(no==1)
         {
             System.out.println("monday");
         }
         else if(no==2)
         {
             System.out.println("tuesday");
         }
         else if(no==3)
         {
             System.out.println("wednesday");
         }else if(no==4)
         {
             System.out.println("thursday");
         }
         else if(no==5)
         {
             System.out.println("friday");
         }
         else if(no==6)
         {
             System.out.println("saturday");
         }
         else if(no==7)
         {
             System.out.println("sunday");
         }
    }
}
        
