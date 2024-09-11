import java.util.*;
public class area
{
    double area=0;
    public void sq(int a)
    {
        area=a*a;
        System.out.println("area of square of side entered"+area);
    }
    public void rect(int l,int b)
    {
         area=l*b; 
         System.out.println("area of rectangle of length and breath entered"+area);
    }
    public void parallel(int h,int ba)
    {
        area=h*ba;
        System.out.println("area of parallelogram  of height and base entered"+area);
    }
    public static void main(String args[])
    {
        area o=new area();
        int a1,b1,l1,ba1,h1;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter side of square");
        a1=kb.nextInt();
        o.sq(a1);
        System.out.println("enter sides of rectangle");
        l1=kb.nextInt();
        b1=kb.nextInt();
        o.rect(l1,b1);
        System.out.println("enter height and base of parallelogram ");
        h1=kb.nextInt();
        ba1=kb.nextInt();
        o.parallel(h1,ba1);
    }
}
