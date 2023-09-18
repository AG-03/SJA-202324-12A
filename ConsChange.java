import java.util.*;
class ConsChange
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Word in lower case");
        String v=in.next();
        String s=v.toLowerCase();
        String st="",str="",ss="",ss2="",out="";
        int a=s.length();
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            int n=(int)ch;
            if(!(n==97||n==101||n==105||n==111||n==117))
                st=st+(char)n;
                else
                str=str+(char)n;
            }
            st=st+str;
            int k=st.length();
            for(int j=0;j<k;j++)
            {
              char cc=st.charAt(j);
              int n=(int)cc;  
              if(!(n==97||n==101||n==105||n==111||n==117))
               {
                char c2=(char)n;
                   char chr=Character.toUpperCase(c2);
                ss=ss+chr;
            }
            else
            ss2=ss2+cc;
        }
        out=out+ss+ss2;
        System.out.println("Original word:" +v);
        System.out.println("Shifted word:" +st);
        System.out.println("Changed word:" +out);
    }}