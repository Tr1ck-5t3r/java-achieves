import java.util.*;
public class s_d_int
{
    public static void main (String args[])
    {
        int a[]=new int[10];
        int i,j,k,min=0,pos=0,ch,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers ");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        for(i=0;i<10;i++)
        {
            min=i;
            for(j=0;j<10-i;j++)
            {
                if(a[j]>a[min])
                min=j;
            }
            c=9-i;
            ch=a[min];
            a[min]=a[c];
            a[c]=ch;
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}