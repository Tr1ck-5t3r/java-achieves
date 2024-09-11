import java.util.*;
public class TSA
{
    double a=0;
    public void cyl(int h,int r)
    {
        a=2*3.146*r*(h+r);
        System.out.println("TSA of cyl"+a);
    }
    public void sph(int r)
    {    
        a=4*3.146*(r*r);
        System.out.println("TSA of cyl"+a);
    }        
    public void cone(int l,int r)
    {
        a=3.146*r*l;
        System.out.println("TSA of cone"+a);
    }
    public static void main(String args[])
    {
        TSA o=new TSA();
        int r1,r2,r3,h1,h2;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter radius and height of cyl");
        r1=kb.nextInt();
        h1=kb.nextInt();
        o.cyl(h1,r1);
        System.out.println("enter radius ofsph");
        r2=kb.nextInt();
        o.sph(r2);
        System.out.println("enter slant height and radius of cone");
        h2=kb.nextInt();
        r3=kb.nextInt();
        o.cone(h2,r3);
    }
}
