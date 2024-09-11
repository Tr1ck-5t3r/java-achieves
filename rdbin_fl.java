import java.io.*;
import java.util.*;
import java.lang.*;
public class rdbin_fl
{
    public static void main (String args[])throws IOException
    { 
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i); 
        FileInputStream f=new FileInputStream ("nam.dat");
        DataInputStream fo=new DataInputStream( f);
        String n=fo.readUTF();
        int no=fo.readInt();
        System.out.println("the name is : "+n);
        System.out.println("the phone no is : "+no);
        fo.close();
        f.close();
    }
}
