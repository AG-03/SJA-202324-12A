import java.util.*;
class SortAlpha
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=in.nextLine();
       String z="";
        String st=s.toUpperCase();
        StringTokenizer str=new StringTokenizer(st);
        int n=str.countTokens();
        String word[]=new String[n];
        for(int i=0;i<n;i++)
        {
            word[i]=str.nextToken();
        }
        Arrays.sort(word);
        for(int j=0;j<n;j++)
        {
      z=z+" " +word[j];      
    }
    System.out.print(z);
}}