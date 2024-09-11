package tarun;

import java.util.*;
public class rev
{
    public static void main(String assd[])
    {
        String s[];
        int n;
        Scanner kb =new Scanner (System.in);
        System.out.println("enter no of lines");
        n=kb.nextInt();
        s=new String [n];
        int i=0,j;
        System.out.println("Enter a string ");
        for(i=0;i<n;i++)
        s[i]=kb.nextLine();
        char c,c1;
        String s1,s2="",s3="";
        int l;
        for(i=0;i<n;i++)
        {
            for(j=0;j<s[i].length();j++)
            {
                c=s[i].charAt(j);
                if(!(c=='.'||c==','||c=='?'||c==';'||c==':'))
                s2+=c;
            }
        }
        StringTokenizer st=new StringTokenizer(s2," ");
        while(st.hasMoreTokens())
        {
            String a=st.nextToken();
            s3=a+" "+s3;
        }
        System.out.println(s3);
    }
    
}
