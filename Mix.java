import java.util.*;
class Mix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,st;
        String str="";
        char chs;
      System.out.println("Enter two words");
        s=in.next();
        st=in.next();
        int a=s.length();
        int b=st.length();
       int k=Math.min(a,b);
        for(int i=0;i<k;i++)
        {
          chs=s.charAt(i);
          char ch=st.charAt(i);
          str=str+chs+ch;
        }
        if(b>a)
        {
        String ss=st.substring(k,b);
        str=str+ss;
    }
    else if(a>b)
    {
        String sf=s.substring(k,a);
    str=str+sf;
    }
    System.out.println(str);
}}