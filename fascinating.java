package tarun;
import java.util.*;
public class fascinating 
{
    public static void main (String args[])
    {
        int a,b,j,c=0,t=0;
        String s;
        char ch;        
        Scanner kb=new Scanner (System.in);
        int test=kb.nextInt();
        for (int  l= 0; l < test; l++) 
        {
            int z=kb.nextInt();
            int y=kb.nextInt();
            for(int n=z;n<=y;n++)
            {
                t=0;
                a=n*2;
                b=n*3;
                s=Integer.toString(n)+""+Integer.toString(a)+""+Integer.toString(b);
                for(char i='1';i<='9';i++)
                {
                    c=0;
                    for(j=0;j<s.length();j++)
                    {
                        ch=s.charAt(j);
                        if(i==ch)
                        c=c+1;
                    }
                    if(c==1)
                    t++;
                }
                if(t==9)
                System.out.print(n+" ");
            }
        }
        kb.close();
    }
}
