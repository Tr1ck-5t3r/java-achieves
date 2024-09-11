package tarun;

import java.util.*;
public class vol
{
    double vol1=0,vol2=0,vol3=0;
    public void cyl(int h,int r)
    {
        vol1=3.14*(r*r)*h;
        System.out.println("volume of cyl"+vol1);
    }
    public void sph(int r2)
    {    
        vol2=4/3*3.14*(r2*r2*r2);
        System.out.println("volume of sph"+vol2);
    }        
    public void cone(int h,int r)
    {
        vol3=3.14*(r*r)/3*h;
        System.out.println("volume of cone"+vol3);
    }
    public static void main(String args[])
    {
        vol o=new vol();
        int r1,r2,r3,h1,h2;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter radius and height of cyl");
        r1=kb.nextInt();
        h1=kb.nextInt();
        o.cyl(h1,r1);
        System.out.println("enter radius ofsph");
        r2=kb.nextInt();
        o.sph(r2);
        System.out.println("enter height and radius of cone");
        h2=kb.nextInt();
        r3=kb.nextInt();
        o.cone(h2,r3);
    }
}
