import java.util.*;
class VowelWord
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
            System.out.println("Enter a sentence");
            String s=in.nextLine();
            int c=0;
            if(!(s.endsWith(".")))
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            else 
            {
                int a=s.length();
                
                   
                String st=s.substring(0,a-1);
                StringTokenizer str=new StringTokenizer(st);
                int n=str.countTokens();
                String word[]=new String[n];
                for(int i=0;i<n;i++)
                {
                    word[i]=str.nextToken();
                    char ch=word[i].charAt(0);
                    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    c++;
                    else
                    continue;
                }
            }
        System.out.println("Frequency of words startng with vowel:-" +c);
        }}