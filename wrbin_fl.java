package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class wrbin_fl
{
    public static void main (String args[])throws IOException
    { 
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i); 
        FileOutputStream f=new FileOutputStream ("nam.dat");
        DataOutputStream fo=new DataOutputStream( f);
        System.out.println("enter the name");
        String n=b.readLine();
        System.out.println("enter the phone no");
        int no=Integer.parseInt(b.readLine());
        n+=" ";
        fo.writeUTF(n);
        fo.writeInt(no);
        fo.close();
        f.close();
    }
}
