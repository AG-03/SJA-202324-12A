import java.util.Scanner;

public class CompositeMagicNumberInRange {                  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        System.out.println("Composite Magic Numbers between " + lowerBound + " and " + upperBound + ":");
        
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isComposite(num) && isMagic(num)) {
                System.out.println(num);
            }
        }
    }
    
    static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        
        return false;
    }
    
    static boolean isMagic(int num) {
        int sum = 0;
        int originalNum = num;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        if (sum == 1) {
            return true;
        } else if (sum >= 10) {
            return isMagic(sum);
        }
        
        return false;
    }
}