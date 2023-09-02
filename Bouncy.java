import java.util.*;
class Bouncy
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
          int n=in.nextInt();
        String st="",str="";
        String s=Integer.toString(n);
        int l=s.length();
        for(int i=0;i<l-1;i++)
        {
            char ch=s.charAt(i);
            char chr=s.charAt(i+1);
            int nn=(int)ch;
            int g=(int)chr;
            if(nn>g)
            {
                int p=nn;
                nn=g;
                g=p;
            st=st+Integer.toString(g)+Integer.toString(p);                     
            }}
            for(int i=0;i<l-1;i++)
        {
            char ch=s.charAt(i);
            char chr=s.charAt(i+1);
            int nn=(int)ch;
            int g=(int)chr;
            if(nn<g)
            {
                int p=nn;
                nn=g;
                g=p;
            str=str+Integer.toString(g)+Integer.toString(p);
        }}
        if(s.equals(st))
        System.out.println("Increasing");
        else if(s.equals(str))
        System.out.println("Decreasing");
        else
        System.out.println("Bouncy Number");
    }}