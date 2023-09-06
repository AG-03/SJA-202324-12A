import java.util.*;
class Common
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        int l;
        String s=in.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='.'||ch==','||ch=='!')
           {
               l=s.indexOf(ch);
               String p=s.substring(0,l); 
               String st=s.substring(l,n);
            }}
            int a=st.length();
            int t=p.length();
            String str=st.substring(0,a);
            String g=s.substring(0,t);
            StringTokenizer ss=new StringTokenizer(str);
            StringTokenizer sk=new StringTokenizer(g);    
            int b=ss.countTokens();
            int k=sk.countTokens();
            String word[]=new String[b];
            String tt[]=new String[k];
            for(int i=0;i<b;i++)
            {
                word[i]=ss.nextToken();
                 for(int j=0;j<k;j++)
                 {
                     tt[j]=sk.nextToken();
                     if(word[i].equals(tt[j]))
                    {
                        System.out.println(word[i]);
                    }
                    else 
                    continue;
                    }}}}}