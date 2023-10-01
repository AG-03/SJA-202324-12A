import java.util.*;
class Change {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=in.nextLine();
        String newstr="";
        char ch1,ch2;
        int len=str.length();
        for(int i=0;i<len;i++) {
        char ch=str.charAt(i);
        if((int)ch>64&&(int)ch<=90) {
        ch1=Character.toLowerCase(ch);
        newstr=newstr+ch1; }
        else if((int)ch>96&&(int)ch<123) {
        ch2=Character.toUpperCase(ch);
        newstr=newstr+ch2;}}
       System.out.println("Original word:" +str);
       System.out.println("Changed word:" +newstr);
    }}