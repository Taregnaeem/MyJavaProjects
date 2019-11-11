import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        double z;
        System.out.println("enter the first number:");
        x = scan.nextInt();
        System.out.println("Enter the second number:");
        y = scan.nextInt();
        z = x / y;
        System.out.println("The result of the tow divided numbers is " + z);

    }
}