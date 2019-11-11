import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator program!");
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter the command( Sum, Difference, Quit ) ");
            String command = reader.nextLine();
            if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Unknown command!");
            }
            System.out.println("Enter the numbers:");
            int first = Integer.parseInt(reader.nextLine());
            int second = Integer.parseInt(reader.nextLine());
            if (command.equals("Sum")) {
                int sum = first + second;
                System.out.println("The sum of the numbers is " + sum);
            } else if (command.equals("Difference")) {
                int difference = first - second;
                System.out.println("The difference of the number is " + difference);
            }

        }
        System.out.println("Thanks, bye!");
    }
}