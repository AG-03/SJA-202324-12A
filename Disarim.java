import java.util.*;
class Disarim              // A disarium number is a number in which the sum of the digits to the power of their respective position
                                                                                 //is equal to the number itself. [10]
                                                                                  //Example: 135 = 11 + 32 + 53
     {                                                                             
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int c=n;   
        double sum=0;
        String s=Integer.toString(n);
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            int num=(int)ch;
            double k=Math.pow(num,(int)i+1);
        sum=sum+k;
        }
        if(sum==c)
        System.out.println("Disarim Number");
        else
        System.out.println("Not a Disarim Number");
    }}