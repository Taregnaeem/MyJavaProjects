import java.util.Scanner;
import java.util.scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner real = new Scanner(System.in);
        System.out.println("Enter the year:");
        int x = real.nextInt();
        if ((x % 400 == 0) || (x % 4 == 0) && (x % 100 != 0)) {
            System.out.println("The year " + x + " is a leap year!");
        } else {
            System.out.println("The year " + x + " is not a leap year!");
        }
    }
}