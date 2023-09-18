import java.util.*;
class TheString
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=in.nextLine();
        int a=s.length();
        int c=0;
       if(a>100)
       {
           System.out.println("Invalid Input");
           System.exit(0);
        }
        else
        {
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        for(int i=0;i<a-1;i++)
        {
            char ch=s.charAt(i);
            char chr=s.charAt(i+1);
            if((ch==' ')&&(chr==' '))
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            continue;
        }
            else 
            c++;
        }
        System.out.println("Original String:" +s);
        System.out.println("Number of words:" +n);
        System.out.println("Number of consonants:" +c);
    }}}