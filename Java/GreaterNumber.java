import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = reader.nextInt();
        System.out.println("Enter the second number:");
        int y = reader.nextInt();
        if (x > y) {
            System.out.println("Greater number " + x);
        } else if (y > x) {
            System.out.println("Greater number " + y);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}