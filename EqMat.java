import java.util.*;
class EqMat
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c=0;
        System.out.println("Enter the number of rows and columns of the matrices");
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];           
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
        {
            System.out.println("Enter a number in this slot");
            a[i][j]=in.nextInt();
        }}
       System.out.println("Enter the elements of second matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
        {
            System.out.println("Enter a number in this slot");
            b[i][j]=in.nextInt();
        }}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
        {
             
            if(a[i][j]!=b[i][j])
            c++;
        }}
        if(c>0)
        System.out.println("Not Equal Matrices");
        else if(c==0)
        System.out.println("Equal Matrices");
    else
    System.out.println("Invalid input");
    }}