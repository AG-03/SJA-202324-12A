import java.util.*;
class DeciOct
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
       String s="";
        int n=in.nextInt();
        while(n>0)
        {
            int d=n%8;
            s=d+s;
            n=n/8;
        }
        System.out.println("Equivalent Octal number:" +s) ;
    }}