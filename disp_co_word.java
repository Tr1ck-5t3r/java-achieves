import java.util.*;
public class disp_co_word 
{
    char c[]=new char[100000];
    int co=0;
    public void word(String s)
    {
        char ch;
        int l,i,j;
        l=s.length();
        for(i=0,j=0;i<l;i++,j++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            j--;
            else
            {
                c[j]=ch;
                co++;
            }
        }
    }
    public void display()
    {
        System.out.println("consonants are:");
        for (int m=0;m<=co;m++)
        System.out.print(c[m]+"  ");
    }
      public static void main(String args[])
    {
        disp_co_word o=new disp_co_word();
        String str;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a word");
        str=kb.next();
        o.word(str);
        o.display();
    }
}