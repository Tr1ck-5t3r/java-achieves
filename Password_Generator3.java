package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Password_Generator3
{
    public static void main(String args[])
    {
        int r=0;/*to choose the constituents of the password*/
        int n=0;/*to store approximate length of the password*/
        String p="";/*to store the password*/
        for(int i=1;i<=15;i++)/*loop to generate the password*/
        {
            r=(int)(1+Math.random()*3);/*a random value between 1 to 3 is generated*/
            n=(int)(1+Math.random()*100);/*a random value between 1 to 100 is generated*/
            if(r==1)/*decision making statement to add special characters to the password*/
            {
                if(n<=25)/*to add a character from first set of special characters*/
                p=p+(char)(33+Math.random()*47);/*a random character of ascii code between 33 to 47 is added*/
                else if(n>25&&n<=50)/*to add a character from second set of special characters*/
                p=p+(char)(58+Math.random()*64);/*a random character of ascii code between 58 to 64 is added*/
                else if(n>50&&n<=75)/*to add a character from third set of special characters*/
                p=p+(char)(91+Math.random()*96);/*a random character of ascii code between 91 to 96 is added*/
                else/*to add a character from fourth set of special characters*/
                p=p+(char)(123+Math.random()*126);/*a random character of ascii code between 123 to 126 is added*/
            }
            if(r==2)/*decision making statement to add Arabic numberals to the password*/
            {
                p=p+(int)((30+Math.random()*39)-30);/* a random number between 0 to 9 is added to the password*/
            }
            if(r==3)/*decision making statement to add alphabetical letters to the password*/
            {
                if(n<=50)
                p=p+(char)(65+Math.random()*90);/* a random letter between A to Z is added to the password*/
                else
                p=p+(char)(97+Math.random()*122);/* a random letter between a to z is added to the password*/
            }
        }
        System.out.println("Generated password: "+p);
    }
}