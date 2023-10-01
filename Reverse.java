import java.util.*;
class Reverse {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
    System.out.println("Enter a word");
    String s=in.nextLine().toUpperCase();
    int a=s.length();
    String subs="",left,s1="",st="",s2="";
    int l=0;
    if(s.startsWith("A")||s.startsWith("E")||s.startsWith("I")||s.startsWith("O")||s.startsWith("U")){
    st=s+"Y";
    System.out.println(st);}
    else {
        for(int i=1;i<a;i++) {
        char ch=s.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        subs=s.substring(i,a-1);
        left=s.substring(0,i);
        s1=s1+subs+left+"C";
        System.out.println(s1);
        break;}}}
    for(int i=1;i<a;i++) {
        char ch=s.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        l++;}
        if(l==0)
        s2=s+"N";
        System.out.print(s2);
    }}