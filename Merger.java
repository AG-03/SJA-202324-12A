import java.util.*;
class Merger
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        long m=in.nextInt();
        long n=in.nextInt();
        String s=Long.toString(m);
        String st=Long.toString(n);
        String str=s.concat(st);
        System.out.println(str);
    }}
        