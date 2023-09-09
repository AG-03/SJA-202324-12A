import java.util.*;
class Q_3_2018
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
       int c=0;
        String s=in.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        String word[]=new String[n];
        for(int i=0;i<n;i++)
        {
            word[i]=st.nextToken();
           char ch=word[i].charAt(0);
            int l=word[i].length();
            if(!((int)ch>=65&&(int)ch<=90))
            c++;
        }
        if(c==0)
        System.out.println("Capital Sentence");
        else 
        System.out.println("Invalid input");
    }}