import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner red = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the first limit:");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second limit:");
        int y = Integer.parseInt(red.nextLine());
        while (x <= y) {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
    }
}