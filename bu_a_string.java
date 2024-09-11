import java.util.*;
public class bu_a_string
{
    public static void main (String args[])
    {
        String a[]=new String[10];
        int i,j;
        String c;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten names");
        for(i=0;i<10;i++)
        a[i]=kb.nextLine();
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    c=a[j+1];
                    a[j+1]=a[j];
                    a[j]=c;
                }
            }
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
    }
}