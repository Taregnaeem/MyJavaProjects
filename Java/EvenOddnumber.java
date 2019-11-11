import java.util.Scanner;

public class EvenOddnumber {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter your number:");
        Scanner reader = new Scanner(System.in);
        x = reader.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number you entered is even!");
        } else {
            System.out.println("The number you entered is odd!");
        }
    }
}