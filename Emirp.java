import java.util.*;
class Emirp
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int c=0,sum=0,k=0;
        for(int i=2;i<n;i++)
        {
        if(n%i==0)
        c++;
    }
    if(c!=0) {
    System.out.println("Not an Emirp Number");
    System.exit(0);
}
    else 
    {
    while(n>0)
    {
        int d=n%10;
        sum=sum*10+d;
        n=n/10;
    }
    for(int i=2;i<sum;i++)
    {
        if(sum%i==0)
        {
            k++;
        }}
        if((k!=0)&&(c!=0))
        {
            System.out.println("Not an Emirp Number");
        }
            else
            System.out.println("Emirp Number");
        }}}