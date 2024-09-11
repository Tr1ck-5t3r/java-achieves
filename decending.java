import java.util.*;
public class decending
{
    public static void main (String args[])
    {
        int a[]=new int[10];
        int i,j,k,m=0,ch;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers ");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        for(i=0;i<10;i++)
        {
            m=i;
            for(j=i+1;j<10;j++)
            if(a[j]>a[m])
            m=j;
            ch=a[m];
            a[m]=a[i];
            a[i]=ch;
        }
        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }
}