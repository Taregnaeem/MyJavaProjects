import java.util.Scanner;

public class SumOfManyNumbers {

    public static void main(String[] args) {
        System.out.println("Please enter the elementary number:");
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;

            } else {
                sum = read + sum;
                System.out.println("Sum now is " + sum);

            }
        }
        System.out.println("Sum in the end: " + sum);
    }
}