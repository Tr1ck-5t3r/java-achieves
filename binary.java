import java.util.*;
public class binary
{
    public static void main (String args[])
    {
        String a[]=new String[10];
        int i,pos=0,l=0,m,u=9;
        String name;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten names");
        for(i=0;i<10;i++)
        a[i]=kb.nextLine();
        System.out.println("enter a name to be searched");
        name=kb.nextLine();
        while(l<=u)
        {
            m=(u+l)/2;
            if(name.equals(a[m]))
            {
                pos=m;
                break;
            }
            if(name.compareTo(a[m])>0)
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
