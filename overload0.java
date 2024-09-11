import java.util.*;
public class overload0
{
    public void  compare(int n1,int n2)
    {
          if(n1<n2)
          System.out.println("n2 is greater in integers");
          else
          System.out.println("n1 is greater in integers ");
    }
        public void  compare(char n1,char n2)
    {
          if(n1<n2)
            System.out.println("n2 is greater in charecters");
            else
            System.out.println("n1 is greater in charecters");
    }
    public static void main(String a[])
    {
        overload0 o=new overload0();
        int no1,no2;
        char ch1,ch2;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter a 2 nos");
        no1=kb.nextInt();
        no2=kb.nextInt();
        System.out.println("enter a 2 charecters");
        ch1=kb.next().charAt(0);
        ch2=kb.next().charAt(0);
        o.compare(ch1,ch2);
        o.compare(no1,no2);
    }
}