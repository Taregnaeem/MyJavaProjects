import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        int x;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number to test:");
        x = num.nextInt();

        if (x > 0) {
            System.out.println("The value you entered is positive");
        } else {
            System.out.println("The number you entered is negative");
        }

    }
}