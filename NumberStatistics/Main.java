import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics numbers = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        while (true) {
            int x = reader.nextInt();
            if (x == -1) {
                break;
            }

            else {

                numbers.addNumber(x);
            }
            if (x % 2 == 0) {
                even.addNumber(x);
            }
            if (x % 2 != 0) {
                odd.addNumber(x);
            }
        }
        System.out.println("sum: " + numbers.sum());
        System.out.println("sum: " + odd.sum());
        System.out.println("Even: " + even.sum());
    }
}
