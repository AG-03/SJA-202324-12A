import java.util.*;
class Dudeney
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    int sum=0,p;
    int a=in.nextInt();
    int k=a;
    String s=Integer.toString(a);
    int l=s.length();
    while(a>0)
    {
        int d=a%10;
        sum=sum+d;
        a=a/10;
    }
    p=(int)Math.pow(sum,3);
    if(p==k)
    System.out.println("Dudeney Number");
    else 
    System.out.println("Not a Dudeney Number");
}}