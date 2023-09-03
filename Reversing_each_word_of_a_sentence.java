import java.util.*;
class Reversing_each_word_of_a_sentence                                               
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
       String s=in.nextLine();
         String ss="";
        int l=s.length(); 
        if(s.endsWith(".")||s.endsWith("!")||s.endsWith("?"))
        {
          String st=s.substring(0,l-1);
            StringTokenizer str=new StringTokenizer(st);
            int n=str.countTokens();
            String word[]=new String[n];
            for(int i=0;i<n;i++)
            {
               String sf=word[i];
                word[i]=str.nextToken();
                int c=word[i].length();
                for(int j=c;j>=0;j--)
                {
                    char ch=sf.charAt(j);
                    ss=ss+ch;
                }
            System.out.print("Reversed String=" +ss);
            }}
        else
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
                }}