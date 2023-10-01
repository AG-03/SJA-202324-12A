import java.util.*;
class Smith {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        int c=0,sum=0,sum2=0,k=0;
        for(int i=2;i<a;i++) {
            if(a%i!=0){
            c++;}
            else continue;
        }
      if(c==0)  {
      System.out.println("Invalid Input");
      System.exit(0);}
      else {
          while(a>0) {
              int d=a%10;
              sum=sum+d;
              a=a/10;}
            }
           for(int i=2;i<a;i++) {
               int n=i;   
               if(a%n==0){
                  for(int j=1;j<n;j++) {
                      if(n%j==0)
                     k++;
                    }}
                if(k==1)
                sum2=sum2+n;
                
            else sum2=sum2+0;
            }
                System.out.println(sum);    
                System.out.println(sum2);
                    if(sum==sum2)
                    System.out.println("Smith Number");
                    else 
                    System.out.println("Not a Smith Number");
                }}