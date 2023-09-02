import java.util.*;
class Comp_Prac2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
             System.out.println("Enter the number of teams");
        n=in.nextInt();
         if(n<=2||n>8)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        else 
        {
            String st[]=new String[n];
           for(int i=0;i<n;i++)
           {
               System.out.println("Enter the name of the team" +((int)i+1) +":");
               st[i]=in.next();
            }        
            for(int i=0;i<n;i++)
            {
                System.out.println("Team" +((int)i+1) +":" +st[i]);
            }
          for(int i=0;i<n;i++)
          {
             String str=st[i];
              int k=str.length();
              for(int j=0;j<k;j++)
              {
                  char ch=st[i].charAt(j);            
                      System.out.println(ch);
                    }
               System.out.print("\t" +"\t");
                }}}}
        
    