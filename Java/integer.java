import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter the first number:");
        x = myscanner.nextInt();
        System.out.println("Enter the second number:");
        y = myscanner.nextInt();
        z = x + y;
        System.out.println("the sum of the tow numbers is " + z);
    }
}