import java.util.*;
class Point {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x1=in.nextInt();
        int y1=in.nextInt();
        double m=(x1+y1)/2.0;
        System.out.println("Midpoint:" +m);
    }}