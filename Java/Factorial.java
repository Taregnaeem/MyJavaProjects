import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number to calculate:");
        int x = Integer.parseInt(reader.nextLine());
        int sum = 1;
        int y = 1;
        while (y <= x) {
            sum = sum * y;
            y++;
        }
        System.out.println(sum);

    }
}
