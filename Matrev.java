import java.util.*;
class Matrev
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns");
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter a number in this slot");
                a[i][j]=in.nextInt();
            }}
            System.out.println("Original matrix=");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j] +"\t");
                }
                System.out.println();
            }
             System.out.println("Reversed matrix=");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
        int num=a[i][j];
        while(num>0)
        {
            int d=num%10;
            sum=sum*10+d;
            num=num/10;
        }
        System.out.print(sum +"\t");
   sum=0;
    }
    System.out.println();
}}}