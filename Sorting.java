import java.util.*;
class Sorting
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       int n,i,j,t;
       System.out.println("Enter the size of the matrix");
       n=in.nextInt();
       int a[]=new int[n];
        int b[][]=new int[n][n];
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
            System.out.print(a[i] +",");
        }}}
    }
    