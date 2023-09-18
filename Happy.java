import java.util.*;
class Happy
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int sum=0;
       while(n>9)
       {
           while(n>0)
           {
               int d=n%10;
               sum=sum+((int)Math.pow(d,2));
               n=n/10;
            }
            n=sum;
            sum=0;
        }
        if(n!=1)
        System.out.println("Not a Happy Number");
        else if(n==1)
        System.out.println("Happy Number");
    }}