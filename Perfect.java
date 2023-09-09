import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=in.nextInt();
        int c=n;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==c)
        System.out.println("Perfect Number");
        else 
        System.out.println("Not a Perfect Number");
    }}