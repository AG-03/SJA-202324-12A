import java.util.*;
class Kap
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int sq;
        int x=n;
        sq=x*x;
String s=Integer.toString(x);
int p=s.length();
int l=sq%(int)Math.pow(10,p);
int f=sq/(int)Math.pow(10,p);
if(n==(f+l))
System.out.println("Kaprekar Number");
else 
System.out.println("Not a Kaprekar Number");
}}
