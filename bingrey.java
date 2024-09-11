package tarun;

import java.util.*;
public class bingrey
{
    int xor(char a, char b)
    {
        if((a=='1'&&b=='1')||(a=='0'&&b=='0'))
        return 0;
        else
        return 1;        
    }
    public static void main(String args[])
    {
        bingrey b= new bingrey();
        Scanner kb=new Scanner(System.in);
        int T = kb.nextInt();
        for (int k = 0; k < T; k++) 
        {
            int x=kb.nextInt();
            String s=Integer.toBinaryString(x);
            System.out.println(s);
            char prev=' ';
            System.out.print("o: ");
            for (int i=0;i<s.length();i++)
            {
                char c= s.charAt(i);
                if(c==s.charAt(0))
                System.out.print(c);
                else
                System.out.print(b.xor(c, prev));
                prev=c;
            }
            System.out.println();
        }
        kb.close();
    }
}
