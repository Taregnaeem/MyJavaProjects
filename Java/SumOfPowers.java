import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate:");
        int x = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int y = 0;
        while (y <= x) {
            int result = (int) Math.pow(2, y);
            sum = result + sum;
            y++;
        }
        System.out.println("The result is " + sum);
    }
}