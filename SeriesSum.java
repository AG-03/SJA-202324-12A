import java.util.*;
class SeriesSum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    double z;
    double sum=0;
    double p=1;
    int x=in.nextInt();
    System.out.println("Enter the number of terms");
    int n=in.nextInt(); 
    for(int i=1;i<=n;i++) {
  p=1;
  for(int j=1;j<n;j++) {
    p=p*j;
  }
  sum=sum+Math.pow(x, i)/p;
 }
System.out.println("The sum is "+sum);
}}