package tarun;

import java.util.*;
public class disp_letter
{
    char c[]=new char[100000];
    int co=0;
    public void letter(String s)
    {
        char ch;
        int l,i,j;
        l=s.length();
        s=" "+s;
        for(i=0,j=0;i<=l;i++,j++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            { 
                c[j]=s.charAt(i+1);
                co++;
            }
            else 
            j--;
        }
    }
    public void display()
    {
        System.out.println("first letters are:");
        for (int m=0;m<=co;m++)
        System.out.print(c[m]+" ");
    }
      public static void main(String args[])
    {
        disp_letter o=new disp_letter();
        String str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a sentence");
        str=kb.nextLine();
        o.letter(str);
        o.display();
    }
}