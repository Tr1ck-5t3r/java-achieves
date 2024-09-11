import java.util.*;
public class _binary
{
    public static void main (String args[])
    {
        int a[]=new int[10];
        int i,pos=0,name,l=0,m,u=9;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers in accending order");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter a name to be searched");
        name=kb.nextInt();
        while(l<=u)
        {
            m=(u+l)/2;
            if(name==a[m])
            {
                pos=m;
                break;
            }
            if(a[m]<name)
            l=m+1;
            else
            u=m-1;
        }
        if(pos!=0)
        System.out.println(a[pos]+" is in "+pos);
        else 
        System.out.println("not found");
    }
}
