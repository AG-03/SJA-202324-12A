import java.util.*;
class SwapSort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word in Upper Cases");
        String s=in.next();
        String st=s.toUpperCase();
       String out="",sort="";
        int l=st.length();
         char ch=st.charAt(0);
         char chr=st.charAt(l-1);
         String str=st.substring(1,l-1);
         out=out+chr+str+ch;
          int a=s.length();
        for(int i=0;i<a-1;i++)
{
        char c=s.charAt(i);
char c2=s.charAt(i+1);                                      
int z=(int)c;
int d=(int)c2;
if(z<d)
{
    int t=z;
    z=d;
  d=t;
    sort=sort+(char)d+(char)t;
}
}
System.out.println("Original word:" +s);
System.out.println("Swapped word:" +out);
System.out.println("Sorted word:" +sort);
}}