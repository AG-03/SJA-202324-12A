import java.util.*;
class Shift                                                     
     {                                                     
public static void main(String args[])
    {
Scanner in=new Scanner(System.in);  
System.out.println("Enter the size of the array");
int m=in.nextInt();
int n=in.nextInt();
int a[][]=new int[m][n];
if(m>5||n>5)
{
    System.out.println("Invalid Input");
    System.exit(0);
}
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.println("Enter a number in this slot");
        a[i][j]=in.nextInt();
    }}
    System.out.println("Original Matrix:");
    for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.print(a[i][j] +"\t");
    }
    System.out.println();
}
System.out.println("Shifted Matrix:");
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(i==0)
  {
      a[m-1][j]=a[i][j];
    }
      else  
      a[i-1][j]=a[i][j];
    }
        
}
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.print(a[i][j] +"\t");
    }
    System.out.println();
}}}