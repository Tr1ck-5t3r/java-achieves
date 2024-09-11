package tarun;

import java.io.*;
import java.lang.*;
import java.util.*;
public class password_generator2
{
    public static void main (String args[])
    {
        Scanner kb=new Scanner(System.in);
        String s="";
        char c;
        int i,n[]={35,36,37,96,33,64,94,38,42,45,95,43,61,63,62,60,65,66,67,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,114,115,115,116,117,118,119,120,121,122,48,49,50,51,52,53,54,55,56,57};
        for(i=0;i<15;i++)
        {
            c=(char)(n[(int)((Math.random()*79))]);
            s+=c;
        }
        System.out.println(s);
    }
}
