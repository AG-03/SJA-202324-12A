import java.util.*;
class Fascinating
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int n2=n*2;
        int n3=n*3;
        int k=0;
        String s=Integer.toString(n);
          String st=Integer.toString(n2);
          String str=Integer.toString(n3);
          String ptsd=s+st+str;
          int a=ptsd.length();
          int f=Integer.parseInt(ptsd);
          if(a!=9)
          {
              System.out.println("Not Fascinating");
              System.exit(0);
            }
            else
            {
               for(int i=0;i<a-1;i++)
               {
                char ch=ptsd.charAt(i);
                char chr=ptsd.charAt(i+1);
                   int g=Character.getNumericValue(ch);
                int h=Character.getNumericValue(chr);
                if(g==h)
                {
                k++;
                }
            }}
            if(k==0)
                System.out.println("Fascinating Number");
                else if(k>=1)
                System.out.println("Not a Fascinating Number");
            }}