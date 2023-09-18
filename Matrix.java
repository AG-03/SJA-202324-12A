import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
       int m=in.nextInt();
       int n=in.nextInt();
        if(m>25||n>25||m!=n)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else {
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter a value in this slot");
                a[i][j]=in.nextInt();
            }}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the values of second matrix");
                b[i][j]=in.nextInt();
            }}
            System.out.println("First matrix:");
            for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
             System.out.println("Second matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("After Subtraction:");       
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            c[i][j]=a[i][j]-b[i][j];
        System.out.print(c[i][j] +"\t");
        }
    System.out.println();
    }
    }}}