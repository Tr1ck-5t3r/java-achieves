package tarun;

import java.io.*;
import java.util.*;
import java.lang.*;
public class readdat_file
{
    public static void main(String args[])throws IOException
    {
        int p;
        FileInputStream f=new FileInputStream("Name.txt");
        while((p=f.read())!=-1)
        {
            if((char)p==' ')
            System.out.println();
            else
            System.out.print((char) p);
        }
        f.close();
    }
}
