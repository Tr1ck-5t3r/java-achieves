import java.util.*;
public class _linear
{
    public static void main (String args [])
    {     
        int a[]=new int[10];
        int i,pos=0,name;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter a name to be searched");
        name=kb.nextInt();
        for(i=0;i<10;i++)
        {
        if(a[i]==name)
        {
        pos=i;
        break;
        }
        }
        if(pos!=0)
        System.out.println(a[pos]+" is in "+pos);
        else 
        System.out.println("not found");
    }   
}