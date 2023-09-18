import java.util.*;
class Combine
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
            System.out.println("Enter the size of first matrix");
            int m=in.nextInt();
            System.out.println("Enter the size of second matrix");
            int n=in.nextInt();
            int a[]=new int[m];
            int b[]=new int[n];
            int k=a.length;
            int g=b.length;
            int f=k+g;
            int c[]=new int[f];
            for(int i=0;i<m;i++)
            {
             System.out.println("Enter a value in this slot for first array");
             a[i]=in.nextInt();
            }
            for(int i=0;i<m;i++)
            {
             System.out.println("Enter a value in this slot for second array");
             b[i]=in.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;   
                    }}}
                    for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(b[j]>b[j+1])
                    {
                        int t=b[j];
                        b[j]=b[j+1];
                        b[j+1]=t;
                    }}}
                    for(int i=0;i<m;i++)
                    {
                        System.out.print(c[i] +',');
                    }
                    for(int i=0;i<n;i++)
                     {
                        System.out.print(c[i] +',');
                    }
                }}