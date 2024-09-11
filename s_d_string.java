import java.util.*;
public class s_d_string
{
    public static void main (String args[])
    {
        String a[]=new String[10];
        int i,k,j,m;
        String c,ch,name;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten names");
        for(i=0;i<10;i++)
        a[i]=kb.nextLine();
        for(i=0;i<10;i++)
        {
            m=i;
            for(j=i+1;j<10;j++)
            if(a[j].compareTo(a[m])>0)
            m=j;
            c=a[m];
            a[m]=a[i];
            a[i]=c;
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}