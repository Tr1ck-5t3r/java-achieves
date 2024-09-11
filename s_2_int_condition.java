import java.util.*;
public class s_2_int_condition
{
    public static void main (String args[])
    {
        int a[]=new int[10];
        int i,j,k,m=0,ch,min=0,pos=0,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten numbers ");
        for(i=0;i<10;i++)
        a[i]=kb.nextInt();
        System.out.println("enter 1 for ascending 2 for descending");
        c=kb.nextInt();
        switch(c)
        {
            case 1:
            for(i=0;i<10;i++)
            {
            m=i;
            for(j=i+1;j<10;j++)
            if(a[j]<a[m])
            m=j;
            ch=a[m];
            a[m]=a[i];
            a[i]=ch;
            }      
            break;
            case 2:
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
            break;
            default:
            System.out.println("Invalid choice");
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}
