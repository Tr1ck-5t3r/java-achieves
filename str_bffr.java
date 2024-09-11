import java.io.*;
import java.util.*;
public class str_bffr
{
    
    public static void main(String asdf[])
    {
        StringBuffer s=new StringBuffer("jova");
        StringBuffer w=new StringBuffer("a");
        System.out.println("append "+s.append(w));
        //System.out.println("setCharAt "+s.setCharAt(1,'a'));
        System.out.println("insert "+s.insert(5,"h"));
        System.out.println("delete "+s.delete(4,5));
        System.out.println("reverse "+s.reverse());
        s.setLength(2);
        System.out.println("length "+s);
    }
}
