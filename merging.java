import java.util.*;
public class merging
{
    public static void main (String args [])
    {     
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        int i,j;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter 5 numbers");
        for(i=0;i<5;i++)
        a[i]=kb.nextInt();
        System.out.println("enter 5 numbers");
        for(i=0;i<5;i++)
        b[i]=kb.nextInt();
        for(i=0;i<5;i++)
        c[i]=a[i];
        for(i=0,j=5;i<5;j++,i++)
        c[j]=b[i]; 
        
        for(i=0;i<10;i++)
        System.out.print(c[i]+" ");
    }   
}