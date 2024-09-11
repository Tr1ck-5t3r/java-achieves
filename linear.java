package tarun;

import java.util.*;
public class linear
{
    public static void main (String args [])
    {     
        String a[]=new String[10];
        int i,pos=0;
        String name,s;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter ten names");
        for(i=0;i<10;i++)
        a[i]=kb.nextLine();
        System.out.println("enter a name to be searched");
        name=kb.nextLine();
        for(i=0;i<10;i++)
        {
        if(a[i].equals(name))
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