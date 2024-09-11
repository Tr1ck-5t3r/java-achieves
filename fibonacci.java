import java.util.*;
public class fibonacci
{
    int a []= new int[10000];  
    int i,j=0,l=0,n;
    Scanner kb=new Scanner (System.in);
    public void  input()
    {
        System.out.println("enter no ");
        n=kb.nextInt();
    }
    public void store()
    {
        for(i=0;i<n;i++)
        {
            if(i==0)
            a[0]=0;
            else if(i==1)
            a[1]=1;
            else
            a[i]=a[i-1]+a[i-2];
        }
    }
    public void display()
    {
        for(i=0;i<n;i++)
        System.out.println(a[i]+" ");
    }
    public static void main(String a[])
    {
        fibonacci o=new fibonacci();
        o.input();
        o.store();
        o.display();
    }
}