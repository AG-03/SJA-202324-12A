import java.util.*;
class n
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       int n,i,j,t;
        int a[]=new int[n];
        int b[][]=new int[n][n];
        System.out.println("Enter the size of the matrix");
        n=in.nextInt();
        if(n<=2||n>=10)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
         else
         {
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a value in this slot");
        }
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Sorted array=");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
    System.out.println("b[][]=");
     for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
            