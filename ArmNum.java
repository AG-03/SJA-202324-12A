import java.util.*;
class ArmNum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
double sum=0;                                                                             
System.out.println("Enter a number");
n=in.nextInt();
String s=Integer.toString(n);
int l=s.length();
while(n>0)
{
    int d=n%10;
    double k=Math.pow(d,l);
   sum=sum+k;
    n=n/10;
}
if(n==sum)
System.out.println("Armstrong number");
else
System.out.println("Not an Armstrong number");
}
}