import java.io.*;
import java.util.*;
import java.lang.*;
public class writedat_file
{
    public static void main(String args[])throws IOException
    {
        int p;
        char c[]={'a','e','i','o','u'};
        File charFile =new File ("charac.txt");
        FileOutputStream f=new FileOutputStream(charFile);
        DataOutputStream fo=new DataOutputStream(f);
        for(int i=0;i<c.length;i++)
        fo.writeChar(c[i]);
        f.close();
    }
}
