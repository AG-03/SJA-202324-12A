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
               // word[i] is null here since it is not initialized yet
                word[i]=str.nextToken();  
                 String sf=word[i]; 
                int c=word[i].length();
                for(int j=c-1;j>=0;j--) //j will start from c-1
                {
                    //char ch=sf.charAt(j); sf is not initailaized
                    sf=word[i];
                    char ch=sf.charAt(j);                    
                    ss=ss+ch;
                }
                ss=ss+" "; //After adding each word, there will be a space
                //System.out.print("Reversed String=" +ss); This will come out of loop else it will Repeat several times
            }
            System.out.print("Reversed String=" +ss);
        }
        else
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
}